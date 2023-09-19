package com.example.designpattern.structure.bridge;

/**
 * 拓展类，如果需要其他公共功能，可以在此类操作
 */
public abstract class RefinedCar extends Car {

    public RefinedCar(Brand brand) {
        super(brand);
    }

    @Override
    public void getFeature() {
        this.brand.getBrand();
        System.out.println(extendMethod());
    }

    /**
     * 拓展方法：车的特性
     */
    public abstract String extendMethod();

}