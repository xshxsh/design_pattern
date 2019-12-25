package com.example.designpattern.create.abstractfactory.factory;

import com.example.designpattern.create.abstractfactory.animal.Animal;
import com.example.designpattern.create.abstractfactory.plant.Plant;
import com.example.designpattern.create.abstractfactory.plant.ApplePlant;
import com.example.designpattern.create.abstractfactory.plant.BananaPlant;

/**
 * 具体工厂2,只种植物
 */
public class PlantFactory extends  AbstractFactory {

    @Override
    public Animal getAnimal(String type) {
        return null;
    }

    @Override
    public Plant getPlant(String type) {
        if ("apple".equals(type)) {
            return new ApplePlant();
        } else if ("banana".equals(type)) {
            return new BananaPlant();
        }
        return null;
    }
}
