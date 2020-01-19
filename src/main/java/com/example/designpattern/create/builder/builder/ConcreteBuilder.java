package com.example.designpattern.create.builder.builder;

/**
 * 具体建造者：实现了抽象建造者接口
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        System.out.println("建造 PartA");
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        System.out.println("建造 PartB");
        product.setPartA("建造 PartB");
    }

    @Override
    public void buildPartC() {
        System.out.println("建造 PartC");
        product.setPartA("建造 PartC");
    }
}