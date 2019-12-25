package com.example.designpattern.create.abstractfactory.plant;

/**
 * 具体植物2，香蕉
 */
public class BananaPlant implements Plant{
    @Override
    public void show() {
        System.out.println("种了一棵香蕉树");
    }
}
