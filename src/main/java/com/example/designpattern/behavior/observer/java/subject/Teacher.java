package com.example.designpattern.behavior.observer.java.subject;

import java.util.Observable;

/**
 * @author xsh
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
        // 状态发生改变
        super.setChanged();
        // 通知观察者
        super.notifyObservers(name);
    }

}