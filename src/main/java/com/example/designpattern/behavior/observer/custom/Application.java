package com.example.designpattern.behavior.observer.custom;

import com.example.designpattern.behavior.observer.custom.observer.ConcreteObserver1;
import com.example.designpattern.behavior.observer.custom.observer.ConcreteObserver2;
import com.example.designpattern.behavior.observer.custom.subject.Subject;

/**
 * @author 谢仕海
 * @date : 2019-12-25 11:49
 * description:原生方法实现观察者模式
 */


public class Application {
    public static void main(String[] args) {
        //要观察的目标
        Subject subject = new Subject();

        //观察者
        new ConcreteObserver1(subject);
        new ConcreteObserver2(subject);

        //目标状态改变
        subject.changeState("change");
    }
}
