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

    public List<String> ItemQuantities() {
        List<String> quantities = new ArrayList<>();

        for (LineItem lineItem : items){
            quantities.add(lineItem.toString());
        }

        return quantities;
    }

    public List<String> OnSaleItems() {
        List<String> onSaleItems = new ArrayList<>();

        for (LineItem lineItem : items){
            if (lineItem.item.isOnSale()){
                onSaleItems.add(lineItem.item.getName()+" - $"+lineItem.item.getPrice());
            }
        }

        return onSaleItems;
    }

    class LineItem{
        Item item;
        int quantity;

        public LineItem(Item item, int quantity) {
            this.item = item;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return item.getName()+" - "+quantity;
        }
    }

}
