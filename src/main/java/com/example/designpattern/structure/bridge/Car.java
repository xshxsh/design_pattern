package com.example.designpattern.structure.bridge;

/**
 * 车抽象类
 * 车引用了品牌，此处是组合关系
 */
public abstract class Car {

    protected Brand brand;

    public Car(Brand brand) {
        this.brand = brand;
    }

    public abstract void getFeature();

}