package com.company.lab5.menu;
import com.company.lab5.utils.Container;
import com.company.lab5.utils.Factory;
import com.company.lab5.utils.ScannerWrapper;

public class UpdateMenuItem<T> implements MenuItem<T> {

    private Container<T> container;
    private Factory<T> factory;
    private ScannerWrapper sc = new ScannerWrapper();



    public UpdateMenuItem(Container<T> container, Factory<T> factory) {
        this.container = container;
        this.factory = factory;
    }


    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public String getTitle() {
        return "Update element";
    }

    @Override
    public void execute() {
        System.out.println("Input index");
        int choice = sc.nextInt(0, container.size());

        container.set(choice, factory.create());
        System.out.println("Element updated successfully!");
    }
}
