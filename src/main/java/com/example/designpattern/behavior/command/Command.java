package com.example.designpattern.behavior.command;

/**
 * 1.抽象命令（Command）: 点菜和取消两个命令
 * 定义：命令是一个抽象接口，定义了执行操作的统一方法。
 */
public interface Command {
    //点菜
    void order();

    //取消点菜
    void cancelOrder();
}