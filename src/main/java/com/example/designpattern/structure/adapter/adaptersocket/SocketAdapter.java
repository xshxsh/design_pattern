package com.example.designpattern.structure.adapter.adaptersocket;

import com.example.designpattern.structure.adapter.chinainterface.ChinaInterface;
import com.example.designpattern.structure.adapter.germanyinterface.GermanyInterface;

/**
 * @author xsh
 * @date : 2020-1-17 16:38
 * description:电源适配器插座，兼容中国标准和德国标准
 * 适配谁，就实现谁的接口
 */


public class SocketAdapter implements GermanyInterface {

    private ChinaInterface chinaInterface;

    public SocketAdapter(ChinaInterface chinaInterface) {
        this.chinaInterface = chinaInterface;
    }

    /**
     * 充电
     */
    @Override
    public void charge() {
        chinaInterface.charge();
    }
}
