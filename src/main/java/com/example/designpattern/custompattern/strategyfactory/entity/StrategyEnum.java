package com.example.designpattern.custompattern.strategyfactory.entity;

/**
 * @author 谢仕海
 * @date : 2020-1-3 9:41
 * description:策略枚举类
 */


public enum StrategyEnum {

    //策略1
    CONCRETESTRATEGY1("ConcreteStrategy1", "策略1"),
    //策略2
    CONCRETESTRATEGY2("ConcreteStrategy2", "策略2");

    private String strategyName;
    private String strategyDesc;

    StrategyEnum(String strategyName, String strategyDesc) {
        this.strategyName = strategyName;
        this.strategyDesc = strategyDesc;
    }

    public String getStrategyName() {
        return strategyName;
    }

}
