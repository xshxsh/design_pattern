package com.example.designpattern.create.factorymethod;

import com.example.designpattern.create.factorymethod.factory.Factory;
import com.example.designpattern.create.factorymethod.product.Product;

public class Application {
    public static void main(String[] args) {
        
        Factory factory = new Factory();
        Product product1 = factory.geProduct("Product1");
        product1.show();

        Product product2 = factory.geProduct("Product2");
        product2.show();
    }
}