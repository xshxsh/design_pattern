package com.example.designpattern.behavior.chain;

/**
 
 
 * @date 2024/3/6 17:08
 * @Copyright Copyright (c)  aulton Inc. All Rights Reserved.
 **/

public class Main {

    public static void main(String[] args) {

        ThirdChain thirdChain = new ThirdChain(null, null);
        SecondChain secondChain = new SecondChain(5, thirdChain);
        FirstChain firstChain = new FirstChain(2, secondChain);

//        firstChain.handler(new LeaveRequest(1)); //请假一天
//
//        firstChain.handler(new LeaveRequest(3));//请假3天
//
        firstChain.handler(new LeaveRequest(6));//请假6天
    }
}
