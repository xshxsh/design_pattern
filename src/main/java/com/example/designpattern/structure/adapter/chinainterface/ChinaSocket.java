package com.example.designpattern.structure.adapter.chinainterface;

/**
 * @author 谢仕海
 * @date : 2020-1-17 16:34
 * description:
 */


public class ChinaSocket implements ChinaInterface {
    /**
     * 充电
     */
    @Override
    public void charge() {
        System.out.println("正在用[中国]标准电源插座充电");
    }
}
