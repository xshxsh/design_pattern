package com.example.designpattern.create.prototype.manager;

import com.example.designpattern.create.prototype.concreate.Circle;
import com.example.designpattern.create.prototype.interfac.Shape;

import java.util.HashMap;

/**
 * @author 谢仕海
 * @date : 2020-1-20 15:32
 * description:原型 管理器
 */


public class ProtoTypeManager {
    private HashMap<String, Shape> manager = new HashMap<String, Shape>();

    public ProtoTypeManager() {
        manager.put("Circle", new Circle());
    }

    public void addshape(String key, Shape obj) {
        manager.put(key, obj);
    }

    public Shape getShape(String key) {
        Shape temp = manager.get(key);
        return (Shape) temp.clone();
    }
}
