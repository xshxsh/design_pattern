package com.example.designpattern.structure.composite;

/**
 * 树叶构件，叶子构件不会被继承
 */
public class Leaf extends Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("子构件" + this.name);
    }
}