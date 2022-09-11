package com.practice.pattern.composite.before;

import java.util.List;

public class Bag {

    private List<Item> items;

    public void add(Item item) {
        this.items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
