package com.example.designpattern.create.factorymethod.factory;


import com.example.designpattern.create.factorymethod.product.ConcreteProduct1;
import com.example.designpattern.create.factorymethod.product.ConcreteProduct2;
import com.example.designpattern.create.factorymethod.product.Product;

/**
 * 工厂类
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