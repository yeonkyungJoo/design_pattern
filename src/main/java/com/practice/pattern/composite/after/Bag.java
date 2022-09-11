package com.practice.pattern.composite.after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
