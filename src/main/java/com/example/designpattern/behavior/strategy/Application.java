package com.example.designpattern.behavior.strategy;

import com.example.designpattern.behavior.strategy.context.Context;
import com.example.designpattern.behavior.strategy.stategy.ConcreteStrategy1;
import com.example.designpattern.behavior.strategy.stategy.ConcreteStrategy2;

/**
 * @author 谢仕海
 * @date : 2019-12-25 11:49
 * description:
 */


public class Application {
    public static void main(String[] args) {
        Context context = new Context();
        ConcreteStrategy1 concreteStrategy1 = new ConcreteStrategy1();

        context.setStrategy(concreteStrategy1);
        context.strategyMethod();

        ConcreteStrategy2 concreteStrategy2 = new ConcreteStrategy2();
        context.setStrategy(concreteStrategy2);
        context.strategyMethod();
    }
}
