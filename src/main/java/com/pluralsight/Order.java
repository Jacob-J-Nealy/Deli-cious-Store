package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {

    // Properties
    private List<Priceable> items = new ArrayList<>();


    // Custom Methods
    public void addItem(Priceable item) {
        items.add(item);
    }
}
