package com.example.designpattern.behavior.command;

/**
 * 命令模式测试类
 */
public class TestCommand {


    public static void main(String[] args) {
        // 创建厨师（接收者）
        Chef chef = new Chef();
        // 创建点菜命令
        Command orderCommand = new OrderCommand(chef);
        // 创建服务员（调用者）
        Waiter waiter = new Waiter();
        // 设置命令
        waiter.setCommand(orderCommand);

        // 服务员接收到点菜请求
        waiter.takeOrder();

        // 服务员接收到取消点菜请求
        waiter.cancelOrder();
    }

}