package com.example.designpattern.custompattern.strategyfactory.factory;

import com.example.designpattern.custompattern.strategyfactory.strategy.Strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 谢仕海
 * @date : 2020-1-3 9:22
 * description:策略工厂，用于保存和过去策略
 */


public class Factory {

    private static Map<String, Strategy> factory = new ConcurrentHashMap<>();

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
