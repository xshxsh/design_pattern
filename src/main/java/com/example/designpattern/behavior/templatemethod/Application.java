package com.example.designpattern.behavior.templatemethod;

public class Application {
    public static void main(String[] args) {
        // A用户办理业务
        AbstractClass tm = new ConcreteClassA();
        tm.TemplateMethod();

        // B用户办理业务
        AbstractClass tmb = new ConcreteClassB();
        tmb.TemplateMethod();
    }
}