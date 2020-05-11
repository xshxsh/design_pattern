package com.example.designpattern.custompattern.strategyfactory.strategy;

import com.example.designpattern.custompattern.strategyfactory.entity.StrategyEnum;
import com.example.designpattern.custompattern.strategyfactory.factory.Factory;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author xsh
 * @date : 2020-1-2 16:10
 * description: 具体策略2
 */


public class ConcreteStrategy2 implements Strategy, InitializingBean {
    /**
     * 策略方法
     */
    @Override
    public void strategyMethod() {
        System.out.println("具体策略2的执行方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Factory.register(StrategyEnum.CONCRETESTRATEGY2.getStrategyName(), this);
    }
}
