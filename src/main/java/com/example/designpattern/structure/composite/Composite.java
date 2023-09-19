package com.example.designpattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件，树枝下可以树枝或树叶
 */
public class Composite extends Component {
    private List<Component> list = new ArrayList<>();

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        for (Component child : list) {
            child.operation();
        }
    }
}