package com.example.designpattern.structure.bridge;

/**
 * 一个“修正”的抽象类
 */
public abstract class RefinedCar extends Car {

    public RefinedCar(Brand brand) {
        super(brand);
    }

    @Override
    public void getFeature() {
        this.brand.getBrand();
        System.out.println(getFeature());
    }

    /**
     * 拓展方法：车的特性
     */
    public abstract String getFeature();

}