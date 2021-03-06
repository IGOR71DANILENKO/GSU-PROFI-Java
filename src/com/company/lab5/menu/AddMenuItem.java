package com.company.lab5.menu;
import com.company.lab5.utils.Container;
import com.company.lab5.utils.Factory;

public class AddMenuItem<T> implements MenuItem<T> {

    private Container<T> container;
    private Factory<T> factory;

    public AddMenuItem(Container<T> container, Factory<T> factory) {
        this.container = container;
        this.factory = factory;
    }

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public String getTitle() {
        return "Add element";
    }

    @Override
    public void execute() {
        container.add(factory.create());
        System.out.println("Element added successfully!");
    }
}
