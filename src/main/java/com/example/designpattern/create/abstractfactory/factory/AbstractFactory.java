package com.example.designpattern.create.abstractfactory.factory;


import com.example.designpattern.create.abstractfactory.animal.Animal;
import com.example.designpattern.create.abstractfactory.plant.Plant;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

    public abstract Animal getAnimal(String type);

    public abstract Plant getPlant(String type);
}
