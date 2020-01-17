package com.example.designpattern.structure.adapter.germanyinterface;

/**
 * @author 谢仕海
 * @date : 2020-1-17 16:35
 * description:
 */


public class GermanySocket implements GermanyInterface {
    /**
     * 充电
     */
    @Override
    public void charge() {
        System.out.println("正在使用[德国]标准电源插座充电");
    }
}
