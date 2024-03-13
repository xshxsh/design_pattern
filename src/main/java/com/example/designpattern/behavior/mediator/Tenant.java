package com.example.designpattern.behavior.mediator;


/**
 * 租客
 */
public class Tenant extends Person {

    Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 租客与中介者联系
     */
    public void contact(String message) {
        mediator.contact(message, this);
    }

    /**
     * 获取信息
     */
    public void getMessage(String message) {
        System.out.println(name + ",获得信息：" + message);
    }
}