package com.example.designpattern.structure.bridge;

/**
 * 跑车
 */
public class Car1 extends Car {
    public Car1(Brand brand) {
        super(brand);
    }

    @Override
    public void getFeature() {
        System.out.println("跑车跑得快");
    }


}