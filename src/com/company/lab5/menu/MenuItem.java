package com.company.lab5.menu;

public interface MenuItem<T> {

    int getOrder();

    String getTitle();

    void execute();
}
