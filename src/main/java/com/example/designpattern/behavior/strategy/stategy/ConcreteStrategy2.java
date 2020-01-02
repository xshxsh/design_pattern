package com.example.designpattern.behavior.strategy.stategy;

/**
 * @author 谢仕海
 * @date : 2020-1-2 16:10
 * description: 具体策略2
 */


public class ConcreteStrategy2 implements Strategy {
    /**
     * 策略方法
     */
    @Override
    public void strategyMethod() {
        System.out.println("具体策略2的执行方法");
    }
}
