package com.example.designpattern.structure.decorator;

/**
 * 矩形
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("这是矩形");
    }
}