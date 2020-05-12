package com.example.designpattern.custompattern.strategyfactory.strategy;

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

//如果是SpringBoot项目，策略类可以这样写，让策略类自动注册到工厂中，工厂类里面就无需用静态代码库来生成策略产品
/*
@Service
public class ConcreteStrategy1 implements Strategy, InitializingBean {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略1的执行方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Factory.register(StrategyEnum.CONCRETESTRATEGY1.getStrategyName(), this);
    }
}
*/