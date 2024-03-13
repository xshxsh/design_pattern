package com.example.designpattern.behavior.mediator;

/**
 * 具体中介：中介须知道所有房主和租房者的信息
 */
public class MediatorStructure extends Mediator {

    private HouseOwner houseOwner;
    private Tenant tenant;


    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String message, Person person) {
        if (person == houseOwner) {          //如果是房东，则租房者获得信息
            tenant.getMessage(message);
        } else {       //反之则是获得房主信息
            houseOwner.getMessage(message);
        }
    }
}