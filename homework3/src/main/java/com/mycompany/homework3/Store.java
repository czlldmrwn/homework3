package com.mycompany.homework3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author НР
 */
public class Store {
    private String name;
    private int moneySpent;
    private int hoursOpen;
    private int hoursClose;

    public Store(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoneySpent(int moneySpent) {
        if (moneySpent>=0){
            this.moneySpent = moneySpent;
        }
        else {
            this.moneySpent = - moneySpent;
        }
    }

    public void setHoursOpen(int hoursOpen) {
        if (hoursOpen>=0) {
            this.hoursOpen = hoursOpen;
        }
        else {
            this.hoursOpen = 0;
        }
    }

    public void setHoursClose(int hoursClose) {
        if (hoursClose <= 24){
            this.hoursClose = hoursClose;
        }
        else {
            this.hoursClose = 24;
        }
    }

    public int getMoneySpent() {
        return moneySpent;
    }

    public int getHoursOpen() {
        return hoursOpen;
    }

    public int getHoursClose() {
        return hoursClose;
    }

    public String getName() {
        return name;
    }
    
public void sellGoods(int moneySpent) {
    System.out.println(name + " sold goods for " + moneySpent + " rubles");
}

public void workFromTo(int hoursOpen, int hoursClose){
    if (hoursOpen > 0 && hoursClose<24){
        System.out.println(name + " works from " + hoursOpen + " to " + hoursClose);
}
    else {
        System.out.println(name + " works for 24 hours");
} 
}
 @Override
    public String toString() {
        return "name=" + getName() + ", moneySpent=" + getMoneySpent() + ", hoursOpen=" + getHoursOpen() + ", hoursClose=" + getHoursClose();
    }
}
