package com.example.designpattern.create.abstractfactory.animal;

/**
 * 具体动物1，牛
 */
public class CowAnimal implements Animal{
    @Override
    public void show() {
        System.out.println("养了一头牛");
    }
}
