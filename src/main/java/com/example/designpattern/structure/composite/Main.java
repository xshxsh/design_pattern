package com.example.designpattern.structure.composite;

/**
 * @author 谢仕海
 * @email xieshihai@aulton.com
 * @date 2023/9/19 15:32
 * @Copyright Copyright (c)  aulton Inc. All Rights Reserved.
 **/

public class Main {

    public static void main(String[] args) {
        Composite c0 = new Composite();
        Composite c1 = new Composite();
        Component leaf1 = new Leaf("叶子1");
        Component leaf2 = new Leaf("叶子2");
        Component leaf3 = new Leaf("叶子3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}
