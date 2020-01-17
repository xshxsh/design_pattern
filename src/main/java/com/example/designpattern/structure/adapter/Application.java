package com.example.designpattern.structure.adapter;


import com.example.designpattern.structure.adapter.adaptersocket.SocketAdapter;
import com.example.designpattern.structure.adapter.chinainterface.ChinaSocket;

public class Application {
    public static void main(String[] args) {
        //场景模拟：中国的手机，现在要到德国去，出门时带上了中国标准的电源
        ChinaSocket chinaSocket = new ChinaSocket();
        //去到德国，把中国的电源插在德国的电源适配器上面进行充电
        SocketAdapter socketAdapter = new SocketAdapter(chinaSocket);
        socketAdapter.charge();
    }
}