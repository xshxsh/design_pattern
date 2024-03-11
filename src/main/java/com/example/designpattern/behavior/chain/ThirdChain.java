package com.example.designpattern.behavior.chain;

/**
 * 第三级审核 总经理
 *
 
 
 * @date 2024/3/6 17:01
 * @Copyright Copyright (c)  aulton Inc. All Rights Reserved.
 **/

public class ThirdChain extends AbstractChain {

    public ThirdChain(Integer day, AbstractChain nextChain) {
        super(day, nextChain);
    }

    @Override
    void handler(LeaveRequest leaveRequest) {
        System.out.println("总经理 审核完毕，流程结束");
    }
}
