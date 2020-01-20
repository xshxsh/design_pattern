package com.example.designpattern.create.prototype;

import com.example.designpattern.create.prototype.concreate.Circle;
import com.example.designpattern.create.prototype.interfac.Shape;
import com.example.designpattern.create.prototype.manager.ProtoTypeManager;

public class Application {
    public static void main(String[] args) {
        ProtoTypeManager pm = new ProtoTypeManager();
        Shape obj1 = (Circle) pm.getShape("Circle");
        obj1.showSomething();

        Shape obj2 = (Shape) pm.getShape("Circle");
        System.out.println(obj1 == obj2);
    }
}