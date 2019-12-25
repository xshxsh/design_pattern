package com.example.designpattern.create.factorymethod.product;

/**
 * 具体产品1
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}