package com.example.designpattern.structure.bridge;

/**
 
 
 * @date 2023/9/6 11:11
 * @Copyright Copyright (c)  aulton Inc. All Rights Reserved.
 **/

public class Main {

    public static void main(String[] args) {
//        RefinedCar car11 = new Car1(new Brand1());
//        RefinedCar car21 = new Car2(new Brand1());
//        RefinedCar car22 = new Car2(new Brand2());
//        car11.drive();
//        car21.drive();
//        car22.drive();

        Car car11 = new Car1(new Brand1());
        Car car21 = new Car2(new Brand1());
        Car car22 = new Car2(new Brand2());
        car11.getFeature();
        car21.getFeature();
        car22.getFeature();

    }
}
