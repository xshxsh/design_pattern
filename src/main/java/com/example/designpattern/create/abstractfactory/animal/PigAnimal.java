package com.example.designpattern.create.abstractfactory.animal;

/**
 * 具体动物1，猪
 */
public class PigAnimal implements Animal {
    @Override
    public void show() {
        System.out.println("养了一头猪");
    }
}
