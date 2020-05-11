package com.example.designpattern.behavior.observer.custom.observer;

import com.example.designpattern.behavior.observer.custom.subject.Subject;

/**
 * @author xsh
 * @date : 2019-12-25 11:18
 * description:具体观察者1
 */


public class ConcreteObserver1 extends Observer {

    /**
     * 增加观察者
     *
     * @param subject
     */
    public ConcreteObserver1(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    /**
     * 观察者发现目标作出改变后进行的响应动作
     */
    @Override
    public void response() {
        System.out.println("观察者1收到目标状态：" + subject.getState());
    }
}
