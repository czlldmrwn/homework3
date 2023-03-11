/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework3;

/**
 *
 * @author НР
 */
public class Revisor extends Store{
    private String firstName;
    private String lastName;

    public Revisor(String firstName, String lastName, String name) {
        super(name);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public void closeStore (Store store){
        String storeName = store.getName();
        if (storeName.equalsIgnoreCase("IKEA")) {
            store.setName(null);
        } 
    }
    
    public void rebrand (Store store) {
        String storeName = store.getName();
        if (storeName.equalsIgnoreCase("MacDonalds")) {
            store.setName("Вкусно и точка");
        } else {
            store.setName(storeName.substring(1));
        }
    }
}
