package com.example.designpattern.behavior.strategy.stategy;

/**
 * @author xsh
 * @date : 2020-1-2 16:10
 * description: 具体策略1
 */


public class ConcreteStrategy1 implements Strategy {
    /**
     * 策略方法
     */
    @Override
    public void strategyMethod() {
        System.out.println("具体策略1的执行方法");
    }
}
