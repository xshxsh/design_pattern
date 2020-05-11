package com.example.designpattern.custompattern.strategyfactory;

import com.example.designpattern.custompattern.strategyfactory.factory.Factory;
import com.example.designpattern.custompattern.strategyfactory.strategy.Strategy;

/**
 * @author xsh
 * @date : 2019-12-25 11:49
 * description:
 */


public class Application {
    public static void main(String[] args) {
        Strategy strategy1 = Factory.getStrategy("ConcreteStrategy1");
        strategy1.strategyMethod();

        Strategy strategy2 = Factory.getStrategy("ConcreteStrategy2");
        strategy2.strategyMethod();
    }
}
