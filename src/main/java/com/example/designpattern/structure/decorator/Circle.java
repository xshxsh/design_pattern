package com.example.designpattern.structure.decorator;

/**
 * 圆
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("这是圆");
    }
}