package com.example.designpattern.behavior.command;

/**
 * 命令模式测试类
 */
public class TestCommand {


    public static void main(String[] args) {
        // 命令接收者 厨师
        Chef chef = new Chef();
        // 具体命令 点菜
        Command orderCommand = new OrderCommand(chef);
        // 命令调用者 服务员
        Waiter waiter = new Waiter();
        // 设置命令
        waiter.setCommand(orderCommand);

        // 服务员接收到点菜请求
        waiter.takeOrder();

        // 服务员接收到取消点菜请求
        waiter.cancelOrder();

    }

    void test() {

        /**
         * 1）Runnable 接口，只定义一个"()V"（表示无参，返回值为void）的方法run。创建Runnable对象的方式也有很多，这里就提一种，那就是定义一个类A实现Runnable接口。
         * 这个类A一般还有其他引用其他对象，然后在run方法里对其进行调用，来完成任务。
         * 对应命令模式，Command接口，也只有一个()V方法，execute。Command的实现类，存有Receiver，然后在execute方法里对Receiver进行操作。
         * 2）Thread对象，通过构造方法把Runnable传入，启动线程后，OS线程将回调Thread.run方法，在这种情况下（即没有覆盖Thread.run），其将调用target.run()，执行Runnable对象。
         * 对应命令模式，Invoker，通过setCommand方法传入命令对象，然后在其某个方法中调用命令对象的execute方法。
         */
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }

}