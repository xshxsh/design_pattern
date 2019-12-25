package com.example.designpattern.behavior.observer.custom.subject;

import com.example.designpattern.behavior.observer.custom.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 谢仕海
 * @date : 2019-12-25 11:08
 * description:要观察的目标
 */


public class Subject {

    //一个目标被多个观察者监听
    private List<Observer> observers = new ArrayList<>();
    //目标当前状态
    private String state;

    /**
     * 目标状态发生改变
     */
    public void changeState(String state) {
        this.state = state;
        notifyObserver();
    }

    /**
     * 目标当前状态
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * 增加观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 通知所有观察者
     */
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.response();
        }
    }
}
