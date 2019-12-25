package com.example.designpattern.behavior.observer.java;

import com.example.designpattern.behavior.observer.java.observer.Student;
import com.example.designpattern.behavior.observer.java.subject.Teacher;

/**
 * @author 谢仕海
 * @date : 2019-12-25 11:49
 * description:使用java已经实现的接口和类实现观察者模式
 */


public class Application {
    public static void main(String[] args) {
        Teacher tony = new Teacher("Tony");

        Student studentA = new Student("A");
        Student studentB = new Student("B");
        Student studentC = new Student("C");

        tony.addObserver(studentA);
        tony.addObserver(studentB);
        tony.addObserver(studentC);

        tony.introduce();
    }
}
