package com.company.lab5;


public class Menu {

    private ScannerWrapper sc = new ScannerWrapper();
    public int count = 0;

    private PublicTransport[] array = new PublicTransport[100];

    private void printHelp() {
        System.out.println("1 - add element");
        System.out.println("2 - update element");
        System.out.println("3 - delete element");
        System.out.println("4 - print all");
        System.out.println("0 - exit");
        System.out.println("---------------------");
        System.out.println("Введите число (от 0 до 4, в сооответствии с пунктами меню):");
    }



    public void run() {
        printHelp();

        while (true) {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1: addElement(); break;
                    case 2: updateElement(); break;
                    case 3: deleteElement(); break;
                    case 4: printAll(); break;
                    case 0: return;
                }
            printHelp();
        }

    }

    public PublicTransport create() {
        System.out.println("1 - create Bus");
        System.out.println("2 - create Trolleybus");

        int choice2 = sc.nextInt();

        PublicTransport result;
        if (choice2 == 1) {
            Bus bus = new Bus(60,50,"AI",99934,0.60,100);
            array[count++] = bus;

            System.out.println("Input bus capacity:");
            int capacity = sc.nextInt();
            bus.setCapacity(capacity);


            System.out.println("Input bus speed:");
            int speed = sc.nextInt();
            bus.setSpeed(speed);

            System.out.println("Input bus number code:");
            String code = sc.nextString();
            bus.setCode("--");
            bus.setCode(code);

            System.out.println("Input bus number:");
            int number = sc.nextInt();
            bus.setNumber(number);

            System.out.println("Input bus tank volume:");
            int tankVolume = sc.nextInt();
            bus.setTankVolume(tankVolume);

            result = bus;
        } else {
            Trolleybus trolleybus = new Trolleybus(0, 0, "", 0, 0.60, 0);
            array[count++] = trolleybus;

            System.out.println("Input trolleybus capacity:");
            int capacity = sc.nextInt();
            trolleybus.setCapacity(capacity);

            System.out.println("Input trolleybus speed:");
            int speed = sc.nextInt();
            trolleybus.setSpeed(speed);


            System.out.println("Input trolleybus number code:");
            String code = sc.nextString();
            trolleybus.setCode(code);


            System.out.println("Input trolleybus number:");
            int number = sc.nextInt();
            trolleybus.setNumber(number);

            /*
            System.out.println("Input trolleybus fare:");
            double fare = sc.nextDouble();
            trolleybus.setFare(fare);
             */

            System.out.println("Input trolleybus lines voltage:");
            int linesVoltage = sc.nextInt();
            trolleybus.setLinesVoltage(linesVoltage);

            result = trolleybus;

        }

        return  result;

    }



    private void addElement() {
        create();
        System.out.println("Элемент добавлен!");
    }

    private void updateElement() {
        System.out.println("Input index");
        int choice = sc.nextInt();
    }

    private void deleteElement() {
        System.out.println("Input index");
        int choice = sc.nextInt();
                }

    private void printAll() {
        for (int i = 0; i < array.length; i++) {
             if (array[i] == null) {
                break;
            }
            System.out.println(array[i]);
        }

    }

}




