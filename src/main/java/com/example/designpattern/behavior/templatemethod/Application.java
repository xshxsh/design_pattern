package com.example.designpattern.behavior.templatemethod;

public class Application {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}