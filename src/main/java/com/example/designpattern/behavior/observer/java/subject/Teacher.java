package com.example.designpattern.behavior.observer.java.subject;

import java.util.Observable;

/**
 * @author 谢仕海
 * @date : 2019-12-25 14:47
 * description:目标
 */


public class Teacher extends Observable {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("我是" + name + "老师");
        super.setChanged();
        super.notifyObservers(name);
    }

}