package com.galvanize.cart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;

        for(Item item : items){
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    public void AddItem(Item item) {
        items.add(item);
    }
}
