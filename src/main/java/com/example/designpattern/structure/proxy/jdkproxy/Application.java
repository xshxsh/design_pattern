package com.example.designpattern.structure.proxy.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * java.lang.reflect.Proxy:生成动态代理类和对象；
 * java.lang.reflect.InvocationHandler（处理器接口）：可以通过invoke方法实现
 */
public class Application {
    public static void main(String[] args) {
        //真实对象
        Subject realSubject = new RealSubject();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);

        //代理对象
        Subject proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);

        proxyClass.sellBooks();

        proxyClass.speak();
    }
}