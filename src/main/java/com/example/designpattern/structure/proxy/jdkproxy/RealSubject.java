package com.example.designpattern.structure.proxy.jdkproxy;

public class RealSubject implements Subject {
    @Override
    public int sellBooks() {
        System.out.println("调用的是卖书的方法");
        return 1;
    }

    @Override
    public String speak() {
        System.out.println("调用的是说话的方法");
        return "张三";
    }
}