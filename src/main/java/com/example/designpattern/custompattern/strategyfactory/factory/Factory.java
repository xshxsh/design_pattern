package com.example.designpattern.custompattern.strategyfactory.factory;

import com.example.designpattern.custompattern.strategyfactory.entity.StrategyEnum;
import com.example.designpattern.custompattern.strategyfactory.strategy.ConcreteStrategy1;
import com.example.designpattern.custompattern.strategyfactory.strategy.ConcreteStrategy2;
import com.example.designpattern.custompattern.strategyfactory.strategy.Strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xsh
 * @date : 2020-1-3 9:22
 * description:策略工厂，用于保存和获取策略
 */


public class Factory {

    private static Map<String, Strategy> factory = new ConcurrentHashMap<>();

    /**
     * 生产策略产品
     */
    static {
        factory.put(StrategyEnum.CONCRETESTRATEGY1.getStrategyName(), new ConcreteStrategy1());
        factory.put(StrategyEnum.CONCRETESTRATEGY2.getStrategyName(), new ConcreteStrategy2());
    }

    /**
     * 获取策略
     *
     * @param strategyName
     * @return
     */
    public static Strategy getStrategy(String strategyName) {
        return factory.get(strategyName);
    }

    /**
     * 注册策略
     *
     * @param strategyName
     * @param Strategy
     */
    public static void register(String strategyName, Strategy Strategy) {
        factory.put(strategyName, Strategy);
    }

}
