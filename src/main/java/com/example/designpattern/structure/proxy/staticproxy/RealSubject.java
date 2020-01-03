package com.example.designpattern.structure.proxy.staticproxy;

/**
 * @author 谢仕海
 * @date : 2020-1-3 17:43
 * description:实际的目标
 */


public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("实际的目标正在干活");
    }
}
