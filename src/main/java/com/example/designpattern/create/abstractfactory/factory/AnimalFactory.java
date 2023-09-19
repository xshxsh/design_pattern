package com.example.designpattern.create.abstractfactory.factory;

import com.example.designpattern.create.abstractfactory.animal.Animal;
import com.example.designpattern.create.abstractfactory.animal.CowAnimal;
import com.example.designpattern.create.abstractfactory.animal.PigAnimal;
import com.example.designpattern.create.abstractfactory.plant.Plant;

/**
 * 具体工厂1,只养动物
 */
public class AnimalFactory extends AbstractFactory {
    @Override
    public Animal getAnimal(String type) {
        if ("cow".equals(type)) {
            return new CowAnimal();
        } else if ("pig".equals(type)) {
            return new PigAnimal();
        }
        return null;
    }

    @Override
    public Plant getPlant(String type) {
        return null;
    }
}
