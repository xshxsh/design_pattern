package com.example.designpattern.create.abstractfactory.plant;

/**
 * 具体植物1，苹果
 */
public class ApplePlant implements Plant {
    @Override
    public void show() {
        System.out.println("种了一棵苹果树");
    }
}