package com.github.xdli.handler;

public class DirectorHandler extends LeaveHandler {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 3) {
            System.out.println("主管审批通过了 " + leaveDays + " 天的请假申请");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(leaveDays);
        }
    }
} 