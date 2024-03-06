package com.example.designpattern.behavior.chain;

/**
 * 第二级审核 经理
 *
 * @author 谢仕海
 * @email xieshihai@aulton.com
 * @date 2024/3/6 17:01
 * @Copyright Copyright (c)  aulton Inc. All Rights Reserved.
 **/

public class SecondChain extends AbstractChain {

    public SecondChain(Integer day, AbstractChain nextChain) {
        super(day, nextChain);
    }

    @Override
    void handler(LeaveRequest leaveRequest) {
        if (leaveRequest.leaveDays <= this.powerDay) {
            System.out.println("第二级审核 经理");
        } else {
            System.out.println("经理 审核完毕，继续给下一级审核");
            this.nextChain.handler(leaveRequest);
        }
    }
}
