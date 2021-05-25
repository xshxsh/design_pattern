package com.example.designpattern.create.singleton;

/**
 * @author: shihai.xie
 * @create: 2021-05-25 19:56
 * @description: 静态内部类的单例模式，解决了饿汉式的马上加载问题，也避免了懒汉式的加锁问题
 **/

public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static final InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
