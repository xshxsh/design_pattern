package com.example.designpattern.create.builder;

import com.example.designpattern.create.builder.builder.Builder;
import com.example.designpattern.create.builder.builder.ConcreteBuilder;
import com.example.designpattern.create.builder.director.Director;
import com.example.designpattern.create.builder.product.Product;

public class Application {
    public static void main(String[] args) {
        //具体工人
        Builder builder = new ConcreteBuilder();
        //包工头
        Director director = new Director(builder);
        //包工头告诉工人如何组装
        Product product = director.construct();
    }
}