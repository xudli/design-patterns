package com.github.xdli;

import com.github.xdli.handler.*;

public class App {
    public static void main(String[] args) {
        // 创建处理者
        LeaveHandler director = new DirectorHandler();
        LeaveHandler manager = new ManagerHandler();
        LeaveHandler ceo = new CEOHandler();
        
        // 设置责任链
        director.setNextHandler(manager);
        manager.setNextHandler(ceo);
        
        // 测试不同天数的请假申请
        System.out.println("=====测试责任链模式=====");
        director.handleRequest(2);  // 主管审批
        director.handleRequest(5);  // 经理审批
        director.handleRequest(15); // CEO审批
        director.handleRequest(40); // 拒绝
    }
}
