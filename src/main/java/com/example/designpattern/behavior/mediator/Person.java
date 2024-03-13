package com.example.designpattern.behavior.mediator;

/**
 * 抽象同事类
 **/

public class Person {
    //联系人姓名
    protected String name;

    //中介人
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
