package com.example.designpattern.behavior.chain;

/**
 * 抽象链
 *
 
 
 * @date 2024/3/6 16:56
 * @Copyright Copyright (c)  aulton Inc. All Rights Reserved.
 **/

public abstract class AbstractChain {

    public AbstractChain(Integer powerDay, AbstractChain nextChain) {
        this.powerDay = powerDay;
        this.nextChain = nextChain;
    }

    /**
     * 已请假为例：
     * 如果请1天的假，只需要和我们的组长说就可以了；但是如果请2~5天的假时，就要去和我们的项目负责人请假；请5天假以上时，可能就需要去找我们的总经理请假了。
     */


    public Integer powerDay;

    public AbstractChain nextChain;

    abstract void handler(LeaveRequest leaveRequest);

}
