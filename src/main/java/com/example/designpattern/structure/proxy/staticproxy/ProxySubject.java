package com.example.designpattern.structure.proxy.staticproxy;

/**
 * @author 谢仕海
 * @date : 2020-1-3 17:44
 * description:目标代理
 */


public class ProxySubject implements Subject {
    private RealSubject realSubject;

    @Override
    public void doSomething() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.doSomething();
        postRequest();
    }

    public void preRequest() {
        System.out.println("访问真实目标之前的预处理");
    }

    public void postRequest() {
        System.out.println("访问真实目标之后的后续处理");
    }
}
