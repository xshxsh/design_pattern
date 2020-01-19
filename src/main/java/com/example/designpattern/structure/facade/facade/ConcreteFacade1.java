package com.example.designpattern.structure.facade.facade;

import com.example.designpattern.structure.facade.subsystem.SubSystem01;
import com.example.designpattern.structure.facade.subsystem.SubSystem02;

/**
 * @author 谢仕海
 * @date : 2020-1-19 15:58
 * description:具体外观角色
 */


public class ConcreteFacade1 extends Facade {
    private SubSystem01 obj1 = new SubSystem01();
    private SubSystem02 obj2 = new SubSystem02();

    @Override
    public void method() {
        obj1.method1();
        obj2.method2();
    }

}
