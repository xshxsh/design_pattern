package com.example.designpattern.behavior.chain;

/**
 * 第一级审核 组长
 *
 
 
 * @date 2024/3/6 17:01
 * @Copyright Copyright (c)  aulton Inc. All Rights Reserved.
 **/

public class FirstChain extends AbstractChain {

    public FirstChain(Integer day, AbstractChain nextChain) {
        super(day, nextChain);
    }

    @Override
    void handler(LeaveRequest leaveRequest) {
        if (leaveRequest.leaveDays <= this.powerDay) {
            System.out.println("第一级审核 组长");
        } else {
            System.out.println("组长 审核完毕，继续给下一级审核");
            this.nextChain.handler(leaveRequest);
        }
    }
}
