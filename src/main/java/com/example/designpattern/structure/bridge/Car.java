package com.example.designpattern.structure.bridge;

/**
 * 车抽象类
 */
public abstract class Car {

    protected Brand brand;

    public Car(Brand brand) {
        this.brand = brand;
    }

    public abstract void getFeature();

}