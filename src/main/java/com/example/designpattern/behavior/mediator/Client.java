package com.example.designpattern.behavior.mediator;

public class Client {
    public static void main(String[] args) {
        //一个房东、一个租房者、一个中介机构
        MediatorStructure mediator = new MediatorStructure();

        //房东和租房者只需要知道中介机构即可
        HouseOwner houseOwner = new HouseOwner("张三房东", mediator);
        Tenant tenant = new Tenant("李四租客", mediator);

        //中介结构要知道房主和租房者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.contact("听说你那里有三室的房主出租.....");
        houseOwner.contact("是的!请问你需要租吗?");
    }
}