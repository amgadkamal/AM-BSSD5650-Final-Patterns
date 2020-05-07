package com.example.myapplication;
import android.app.Activity;
import android.content.Intent;
import java.util.ArrayList;

//implement aggregate interface "Order", to concrete Aggregate TotalOrder
public class Totalorder implements Order {
    public String type;
    int i;
    ArrayList<String> menuItems;

    public Totalorder() {
        menuItems = new ArrayList<String>();
        addItem("ChicenBurger ");
       addItem("Fil-O-Fish ");
        addItem("CheeseBurger");

    }

    public void addItem(String name)
    {
        menuItems.add(name);
    }
    public ArrayList<String> getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new TotalOrderIterator(menuItems);
    }
    public String toString() {
        return "Total Order";
    }


}

