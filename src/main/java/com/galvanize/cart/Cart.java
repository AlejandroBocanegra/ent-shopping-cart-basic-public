package com.galvanize.cart;

import java.util.ArrayList;

//import java.util.List;

public class Cart {
    private Item cartItems;

    public Cart() {
        cartItems = new Item();
    }

    public ArrayList<Item> getItems() {
        return new ArrayList<Item>();
    }

    public Integer getTotalPrice() {
        return 0;
    }
}
