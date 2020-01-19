package com.example.designpattern.create.builder.director;

import com.example.designpattern.create.builder.builder.Builder;
import com.example.designpattern.create.builder.product.Product;

/**
 * 指挥者：调用建造者中的方法完成复杂对象的创建
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法、顺序
    public Product construct() {
        //先造A
        builder.buildPartA();
        //再造B
        builder.buildPartB();
        //最后造C
        builder.buildPartC();
        return builder.getResult();
    }
}