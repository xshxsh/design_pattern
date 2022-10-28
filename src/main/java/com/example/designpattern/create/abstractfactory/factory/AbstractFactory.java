package com.example.designpattern.create.abstractfactory.factory;


import com.example.designpattern.create.abstractfactory.animal.Animal;
import com.example.designpattern.create.abstractfactory.plant.Plant;

/**
 * 抽象工厂（可用接口，可用抽象类）
 * 抽象类和接口的区别：
 * 抽象类需要继承，表示A is B 的意思，是对事物本质的描述，比如，人，都具有眼睛、鼻子、嘴巴，所以亚洲人、欧洲人、非洲人都可以继承人的抽象类。
 * 接口需要实现，是对事物行为的描述，比如有人会打篮球，有人会打羽毛球，那打球就可以写成接口，需要打球这个行为的人就实现这个接口。
 * 再举个例子，门，都具有开和关两个本质行为，那门就可以写成抽象类，木门也是门，铁门也是门。但是，有些门有门铃，有些门没有，那门铃就可以写成接口。
 */
public abstract class AbstractFactory {

    public abstract Animal getAnimal(String type);

    public abstract Plant getPlant(String type);
}
