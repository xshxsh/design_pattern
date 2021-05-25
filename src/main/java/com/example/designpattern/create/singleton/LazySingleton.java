package com.example.designpattern.create.singleton;


/**
 * 线程安全的懒汉单例模式
 * 该模式的特点是类加载时没有生成单例，只有当第一次调用 getInstance 方法时才去创建这个单例。
 */
public class LazySingleton {

    //保证 instance 在所有线程中同步
    private static volatile LazySingleton instance = null;

    //private 避免类在外部被实例化
    private LazySingleton() {
    }

    //利用双重锁保证线程安全
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
