package com.example.designpattern.behavior.chain;


/**
 * 请假 请求类
 */
public class LeaveRequest { //假条类
    public int leaveDays;//请假天数

    public LeaveRequest(int days) {
        leaveDays = days;
    }
}