package com.example.myapplication;

import java.util.ArrayList;
//implement Iterator , concrete Iterator
public class TotalOrderIterator implements Iterator {
    ArrayList<String> items;
    int position = 0;

    public TotalOrderIterator(ArrayList<String> items) {
        this.items = items;
    }

    public String next() {
        String menuItem = (String) items.get(position);
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}

