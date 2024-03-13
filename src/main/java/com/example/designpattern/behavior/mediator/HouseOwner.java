package com.example.designpattern.behavior.mediator;

/**
 * 房东
 */
public class HouseOwner extends Person {

    HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 房东与中介联系
     */
    public void contact(String message) {
        mediator.contact(message, this);
    }

    /**
     * @param message
     * @desc 获取信息
     */
    public void getMessage(String message) {
        System.out.println(name + ",获得信息：" + message);
    }
}