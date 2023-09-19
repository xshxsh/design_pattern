package com.example.designpattern.structure.bridge;

/**
 * 轿车
 */
public class Car2 extends Car {
    public Car2(Brand brand) {
        super(brand);
    }

    @Override
    public void getFeature() {
        System.out.println(this.brand.getBrand() + "轿车便宜好用");
    }


}