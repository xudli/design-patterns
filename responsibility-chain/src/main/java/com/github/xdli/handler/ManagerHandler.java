package com.github.xdli.handler;

public class ManagerHandler extends LeaveHandler {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 7) {
            System.out.println("经理审批通过了 " + leaveDays + " 天的请假申请");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(leaveDays);
        }
    }
} 