package com.example.designpattern.structure.facade.facade;

import com.example.designpattern.structure.facade.subsystem.SubSystem01;
import com.example.designpattern.structure.facade.subsystem.SubSystem03;

/**
 * @author xsh
 * @date : 2020-1-19 15:58
 * description:具体外观角色
 */


public class ConcreteFacade2 extends Facade {
    private SubSystem01 obj1 = new SubSystem01();
    private SubSystem03 obj3 = new SubSystem03();

    @Override
    public void method() {
        obj1.method1();
        obj3.method3();
    }

}
