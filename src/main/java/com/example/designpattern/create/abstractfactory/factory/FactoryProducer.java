package com.example.designpattern.create.abstractfactory.factory;

/**
 * 工厂生成器
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String type) {
        if ("animal".equals(type)) {
            return new AnimalFactory();
        } else if ("plant".equals(type)) {
            return new PlantFactory();
        }
        return null;
    }
}
