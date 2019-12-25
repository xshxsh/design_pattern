package com.example.designpattern.create.abstractfactory;

import com.example.designpattern.create.abstractfactory.animal.Animal;
import com.example.designpattern.create.abstractfactory.factory.AbstractFactory;
import com.example.designpattern.create.abstractfactory.factory.FactoryProducer;
import com.example.designpattern.create.abstractfactory.plant.Plant;

public class Application {
    public static void main(String[] args) {
        AbstractFactory animal = FactoryProducer.getFactory("animal");
        Animal pig = animal.getAnimal("pig");
        pig.show();

        AbstractFactory plant = FactoryProducer.getFactory("plant");
        Plant apple = plant.getPlant("apple");
        apple.show();
    }
}