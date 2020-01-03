package com.example.designpattern.structure.proxy.staticproxy;

/**
 * @author 谢仕海
 * @date : 2019-12-25 11:49
 * description:
 */


public class Application {
    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject();
        proxySubject.doSomething();
    }
}
