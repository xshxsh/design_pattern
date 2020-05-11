package com.example.designpattern.behavior.observer.custom.observer;

import com.example.designpattern.behavior.observer.custom.subject.Subject;

/**
 * @author xsh
 * @date : 2019-12-25 11:09
 * description:抽象观察者
 */


public abstract class Observer {

   protected Subject subject;

    /**
     * 观察者发现目标作出改变后进行的响应动作
     */
    public abstract void response();
}
