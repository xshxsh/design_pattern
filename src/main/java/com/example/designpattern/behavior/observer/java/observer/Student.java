package com.example.designpattern.behavior.observer.java.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author 谢仕海
 * @date : 2019-12-25 14:47
 * description:观察者
 */

public class Student implements Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        introduce((String) arg);
    }

    public void introduce(String teacherName) {
        System.out.println(teacherName + "老师你好，" + "我的名字叫" + name);
    }

}