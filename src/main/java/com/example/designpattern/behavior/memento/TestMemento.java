package com.example.designpattern.behavior.memento;

/**
 * 备忘录模式测试类
 */
public class TestMemento {

    public static void main(String[] args) {
        //创建文本编辑器（源发器）
        Originator originator = new Originator();
        //创建管理者
        Caretaker caretaker = new Caretaker();

        // 编辑文本并保存状态
        originator.setContent("Hello11");
        caretaker.push(originator.createMemento());
        System.out.println("当前内容: " + originator.getContent());

        // 编辑更多文本并再次保存状态
        originator.setContent("Hello22");
        caretaker.push(originator.createMemento());
        System.out.println("当前内容: " + originator.getContent());

        originator.setContent("Hello33");
        System.out.println("当前内容: " + originator.getContent());

        // 恢复之前的状态
        originator.restoreMemento(caretaker.pop());
        System.out.println("恢复后上一次内容: " + originator.getContent());

        originator.restoreMemento(caretaker.pop());
        System.out.println("恢复后上二次内容: " + originator.getContent());
    }

}