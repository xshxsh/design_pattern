package com.example.designpattern.create.factorymethod;

/**
 * 具体产品1
 */
class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}