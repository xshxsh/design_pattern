package com.example.designpattern.behavior.templatemethod;

public class ConcreteClassB extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("B用户方法1...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("B用户方法2...");
    }
}