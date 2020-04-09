package com.company.lab5;

public class TransportFactory {

    private ScannerWrapper sc = new ScannerWrapper();

    /*public PublicTransport create() {
        System.out.println("1 - create Bus");
        System.out.println("2 - create Trolleybus");

        int choice = sc.nextInt();

        PublicTransport result;
        if (choice == 1) {
            Bus bus = new Bus(60, 50, "AI", 55561, 0.60, 100);

            System.out.println("Input bus number code");
            String code = sc.nextLine();

            bus.setCode(code);

            System.out.println("Input bus number");
            int number = sc.nextInt();

            bus.setNumber(number);

            result = bus;
        } else {
            Trolleybus trolleybus = new Trolleybus(60, 50, "VA", 04351, 0.60, 600);

            System.out.println("Input bus number code");
            String code = sc.nextLine();

            trolleybus.setCode(code);

            System.out.println("Input bus number");
            int number = sc.nextInt();

            trolleybus.setNumber(number);

            result = trolleybus;
        }

        return  result;

    }

     */
}

