package com.example.designpattern.structure.bridge;


/**
 * 引擎1
 */
public class Brand1 implements Brand {

    @Override
    public void getBrand() {
        System.out.println("奥迪");
    }
}