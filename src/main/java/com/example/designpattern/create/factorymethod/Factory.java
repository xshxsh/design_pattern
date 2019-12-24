package com.example.designpattern.create.factorymethod;

/**
 * 工厂接口
 */
public class Factory {
    public Product geProduct(String type) {
        if ("Product1".equals(type)) {
            return new ConcreteProduct1();
        } else if ("Product2".equals(type)) {
            return new ConcreteProduct2();
        }
        return null;
    }
}