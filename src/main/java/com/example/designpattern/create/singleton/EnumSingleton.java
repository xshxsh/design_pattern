package com.example.designpattern.create.singleton;

/**
 
 * @create: 2021-05-25 20:03
 * @description: 枚举类单例模式，出自<<efficient java>>，防止通过反射机制或者反序列化创建新的实例
 **/

public enum EnumSingleton {
    INSTANCE;

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

}
