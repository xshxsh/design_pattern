package com.example.designpattern.behavior.mediator;

/**
 * 抽象中介人
 */
public abstract class Mediator {

    /**
    * 声明联络方案
    * @param message 要交流的消息
    * @param person 联系人
    * @time  : 2024/3/13 15:12
    **/
    public abstract void contact(String message,Person person);
}