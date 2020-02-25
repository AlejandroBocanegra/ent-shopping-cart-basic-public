package com.galvanize.cart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    List<LineItem> items = new ArrayList<>();

    public List<LineItem> getItems() {
        return items;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;

        for(LineItem item : items){
            totalPrice += item.item.getPrice()*item.quantity;
        }

        return totalPrice;
    }

    public void addItem(Item item, int quantity) {
        items.add(new LineItem(item, quantity));
    }

    public void addItem(Item item){
        addItem(item, 1);
    }

    public List<String> ItemizedList() {
        List<String> itemList = new ArrayList<>();

        for (LineItem item : items){
            itemList.add(item.item.toString());
        }

        return itemList;
    }

    class LineItem{
        Item item;
        int quantity;

        public LineItem(Item item, int quantity) {
            this.item = item;
            this.quantity = quantity;
        }
    }

}
