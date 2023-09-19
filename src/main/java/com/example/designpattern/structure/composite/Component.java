package com.example.designpattern.structure.composite;

/**
 * 抽象构件：它可以是接口或抽象类，为叶子构件和容器构件对象声明接口，在该角色中可以包含所有子类共有行为的声明和实现。
 * 在抽象构件中定义了访问及管理它的子构件的方法，如增加子构件、删除子构件、获取子构件等。
 */
public abstract class Component {

    /**
     * 增加成员
     */
    public void add(Component c) {
    }

    /**
     * 删除成员
     */
    public void remove(Component c) {
    }

    /**
     * 获取成员
     */
    public Component getChild(int i) {
        return null;
    }

    /**
     * 业务方法
     */
    public void operation() {
    }

}