package com.example.designpattern.create.prototype.concreate;

import com.example.designpattern.create.prototype.interfac.Shape;

/**
 * @author 谢仕海
 * @date : 2020-1-20 15:26
 * description:具体原型-圆形
 */


public class Circle implements Shape {
    @Override
    public Object clone() {
        Circle circle = null;
        try {
            circle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝原型失败");
        }
        return circle;
    }

    @Override
    public void showSomething() {
        System.out.println("这是原型-圆形");
    }
}
