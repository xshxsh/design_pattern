package com.example.designpattern.create.prototype.interfac;

/**
 * 原型类接口-形状
 */
public interface Shape extends Cloneable {

    Object clone();

    void showSomething();
}