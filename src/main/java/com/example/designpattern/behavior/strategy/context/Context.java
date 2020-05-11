package com.example.designpattern.behavior.strategy.context;

import com.example.designpattern.behavior.strategy.stategy.Strategy;

/**
 * @author xsh
 * @date : 2020-1-2 16:11
 * description:环境类
 */


public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
