package com.example.designpattern.structure.flyweight;

/**
 * 圆
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("画一个" + color + "色的圆，x坐标：" + x + "，y坐标：" + y);
    }
}