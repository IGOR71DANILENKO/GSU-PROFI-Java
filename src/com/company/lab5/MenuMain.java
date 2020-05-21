package com.company.lab5;


import com.company.lab5.menu.*;
import com.company.lab5.model.TransportFactory;
import com.company.lab5.model.domain.PublicTransport;
import com.company.lab5.network.NetworkClientContainer;
import com.company.lab5.utils.Container;
import com.company.lab5.utils.Factory;
import com.company.lab5.utils.LocalContainer;

import java.io.IOException;

public class MenuMain {

    public static void main(String[] args) throws IOException {

        Factory<PublicTransport<?>> factory = new TransportFactory();
        Container<PublicTransport<?>> container = new NetworkClientContainer<PublicTransport<?>>("localhost", 8080);

        MenuItem<PublicTransport<?>>[] items = new MenuItem[3];

        items[0] = new AddMenuItem<>(container, factory);
        items[1] = new DeleteMenuItem<>(container);
        items[2] = new PrintAllMenuItem<>(container);



        TopLevelMenu<PublicTransport<?>> menu1 = new TopLevelMenu<>(items, "transport menu", 0);
        menu1.execute();
    }
}

