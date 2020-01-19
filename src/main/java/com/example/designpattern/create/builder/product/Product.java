package com.example.designpattern.create.builder.product;

/**
 * 产品角色：包含多个组成部件的复杂对象
 */
public class Product {
    //产品的属性A
    private String partA;
    //产品的属性B
    private String partB;
    //产品的属性C
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

}