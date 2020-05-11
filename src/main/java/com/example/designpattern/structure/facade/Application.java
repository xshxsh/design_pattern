package com.example.designpattern.structure.facade;

import com.example.designpattern.structure.facade.facade.ConcreteFacade1;
import com.example.designpattern.structure.facade.facade.Facade;

/**
 * @author xsh
 * @date : 2019-12-25 11:49
 * description:
 */


public class Application {
    public static void main(String[] args) {
        //比如办证：先去窗口01办完，再去窗口02办完，最后去窗口03，
        // 现在只需要一个窗口搞掂
        Facade facade = new ConcreteFacade1();
        facade.method();
    }
}
