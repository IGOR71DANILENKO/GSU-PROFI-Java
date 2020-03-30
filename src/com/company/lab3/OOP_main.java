package com.company.lab3;

public class OOP_main {

    public static void main(String[] args) {

        Bus route20 = new Bus(90, 60);
        System.out.println(route20.bus_toString());

        Trolleybus route10 = new Trolleybus(90, 50);
        route10.setConductor(0);
        System.out.println(route10.trolleybus_toString());




    }


}