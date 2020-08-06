package com.galvanize.cart;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private List<String> items;
    
    public Item () {
        items= new ArrayList<String>();
        // Item.add("Fendi Sunshades for Your Eyes");
        // Item.add("Kirkland Sweatpants");
        // Item.add("Exchange Select Urban Hoodie");
    }

    public List<String> getItemList() {
        return items;
    }

}
