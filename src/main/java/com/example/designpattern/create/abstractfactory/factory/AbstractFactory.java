package com.example.designpattern.create.abstractfactory.factory;


import com.example.designpattern.create.abstractfactory.animal.Animal;
import com.example.designpattern.create.abstractfactory.plant.Plant;

/**
 * 抽象工厂
 * 比如：农场可以养动物，如养马、养牛；还可以培养植物，如种菜、种水果等
 */
public abstract class AbstractFactory {

    public abstract Animal getAnimal(String type);

    public abstract Plant getPlant(String type);
}
