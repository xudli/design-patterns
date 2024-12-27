# 责任链模式示例 - 请假审批流程

## 项目介绍
这是一个使用责任链模式（Chain of Responsibility Pattern）实现的请假审批流程示例。该示例展示了如何通过责任链模式来处理不同级别的请假申请。

## 设计思路

### 1. 核心组件

- `LeaveHandler`（抽象处理者）：定义了处理请求的接口
- `DirectorHandler`（主管）：处理 3 天以内的请假
- `ManagerHandler`（经理）：处理 7 天以内的请假
- `CEOHandler`（CEO）：处理 30 天以内的请假

### 2. 处理流程

1. 所有请假申请从主管开始审批
2. 如果主管无权处理，传递给经理
3. 如果经理无权处理，传递给 CEO
4. 如果 CEO 也无法处理（超过30天），则拒绝申请

### 3. 责任链模式的优点

- **解耦**: 请求发送者和接收者解耦
- **灵活性**: 可以动态改变链内的成员或调整次序
- **单一职责**: 每个处理者只需关注自己的处理逻辑
- **开闭原则**: 新增处理者无需修改原有代码

## 代码结构

``` yaml
src/main/java/com/github/xdli/
├── App.java # 主程序入口
└── handler/ # 处理者包
├── LeaveHandler.java # 抽象处理者
├── DirectorHandler.java # 主管处理者
├── ManagerHandler.java # 经理处理者
└── CEOHandler.java # CEO处理者
```

## 使用示例

```java
// 创建处理者
LeaveHandler director = new DirectorHandler();
LeaveHandler manager = new ManagerHandler();
LeaveHandler ceo = new CEOHandler();

// 组装责任链
director.setNextHandler(manager);
manager.setNextHandler(ceo);

// 处理请假申请
director.handleRequest(2);  // 2天假期，由主管审批
director.handleRequest(5);  // 5天假期，由经理审批
director.handleRequest(15); // 15天假期，由CEO审批
director.handleRequest(40); // 40天假期，拒绝
```

## 运行结果

=====测试责任链模式=====
主管审批通过了 2 天的请假申请
经理审批通过了 5 天的请假申请
CEO审批通过了 15 天的请假申请
请假天数太多，申请被拒绝！


## 实际应用场景

1. 审批流程
2. 日志级别处理
3. 异常处理链
4. 过滤器链
5. 中间件处理

## 扩展建议

1. 可以添加请假原因、请假类型等属性
2. 可以实现请假申请的持久化
3. 可以添加邮件通知功能
4. 可以增加更多的处理者角色