package com.github.xdli.handler;

public class CEOHandler extends LeaveHandler {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 30) {
            System.out.println("CEO审批通过了 " + leaveDays + " 天的请假申请");
        } else {
            System.out.println("请假天数太多，申请被拒绝！");
        }
    }
} 