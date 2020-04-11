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
                    while (choice <= -1 || choice >= 5) {
                        System.out.println("Error! Please type correct value! (0-4)");
                        int choiceCorrect = choice;
                        choiceCorrect = sc.nextInt();
                        choice = choiceCorrect;
                    }

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
            Bus bus = new Bus(0,0,"AI",99934,0.60,100);
            array[count++] = bus;

            System.out.println("Input bus capacity:");
            int capacity = sc.nextInt();
            while (capacity <= 49 || capacity >= 101) {
                System.out.println("Error! Please type correct value! (50-100)");
                int capacityCorrect = capacity;
                capacityCorrect = sc.nextInt();
                capacity = capacityCorrect;
            }
            bus.setCapacity(capacity);

            System.out.println("Input bus speed:");
            int speed = sc.nextInt();
            while (speed <= 59 || speed >= 91) {
                System.out.println("Error! Please type correct value! (60-90)");
                int speedCorrect = speed;
                speedCorrect = sc.nextInt();
                speed = speedCorrect;
            }
            bus.setSpeed(speed);

            System.out.println("Input bus number code:");
            String code = sc.nextString();
            bus.setCode(code);

            System.out.println("Input bus number:");
            int number = sc.nextInt();
            while (number <= 999 || number >= 9999) {
                System.out.println("Error! Please type correct value! (4 digits)");
                int numberCorrect = number;
                numberCorrect = sc.nextInt();
                number = numberCorrect;
            }
            bus.setNumber(number);

            System.out.println("Input bus fare:");
            double fare = sc.nextDouble();
            bus.setFare(fare);

            System.out.println("Input bus tank volume:");
            int tankVolume = sc.nextInt();
            while (tankVolume <= 209 || tankVolume >= 401) {
                System.out.println("Error! Please type correct value! (210-400)");
                int tankVolumeCorrect = tankVolume;
                tankVolumeCorrect = sc.nextInt();
                tankVolume = tankVolumeCorrect;
            }
            bus.setTankVolume(tankVolume);

            result = bus;
        } else {
            Trolleybus trolleybus = new Trolleybus(0, 0, "", 0, 0.60, 0);
            array[count++] = trolleybus;

            System.out.println("Input trolleybus capacity:");
            int capacity = sc.nextInt();
            while (capacity <= 49 || capacity >= 101) {
                System.out.println("Error! Please type correct value! (50-100)");
                int capacityCorrect = capacity;
                capacityCorrect = sc.nextInt();
                capacity = capacityCorrect;
            }
            trolleybus.setCapacity(capacity);

            System.out.println("Input trolleybus speed:");
            int speed = sc.nextInt();
            while (speed <= 59 || speed >= 91) {
                System.out.println("Error! Please type correct value! (60-90)");
                int speedCorrect = speed;
                speedCorrect = sc.nextInt();
                speed = speedCorrect;
            }
            trolleybus.setSpeed(speed);


            System.out.println("Input trolleybus number code:");
            String code = sc.nextString();
            trolleybus.setCode(code);


            System.out.println("Input trolleybus number:");
            int number = sc.nextInt();
            while (number <= 999 || number >= 9999) {
                System.out.println("Error! Please type correct value! (4 digits)");
                int numberCorrect = number;
                numberCorrect = sc.nextInt();
                number = numberCorrect;
            }
            trolleybus.setNumber(number);

            /*
            System.out.println("Input trolleybus fare:");
            double fare = sc.nextDouble();
            trolleybus.setFare(fare);
             */

            System.out.println("Input trolleybus lines voltage:");
            int linesVoltage = sc.nextInt();
            while (linesVoltage <= 549 || linesVoltage >= 601) {
                System.out.println("Error! Please type correct value! (550-600)");
                int linesVoltageCorrect = linesVoltage;
                linesVoltageCorrect = sc.nextInt();
                linesVoltage = linesVoltageCorrect;
            }
            trolleybus.setLinesVoltage(linesVoltage);

            result = trolleybus;

        }

        return  result;

    }



    private void addElement() {
        create();
        System.out.println("Element added successfully!");
    }

    private void updateElement() {
        System.out.println("Input index");
        int choice = sc.nextInt();
        Bus bus = new Bus(0, 0, "", 0, 0.6, 0);
        Trolleybus trolleybus = new Trolleybus(0, 0, "", 0, 0.6, 0);
        if (array[choice].getClass() == bus.getClass()) {
            array[choice] = bus;

            System.out.println("Input bus capacity:");
            int capacity = sc.nextInt();
            while (capacity <= 49 || capacity >= 101) {
                System.out.println("Error! Please type correct value! (50-100)");
                int capacityCorrect = capacity;
                capacityCorrect = sc.nextInt();
                capacity = capacityCorrect;
            }
            bus.setCapacity(capacity);

            System.out.println("Input bus speed:");
            int speed = sc.nextInt();
            while (speed <= 59 || speed >= 91) {
                System.out.println("Error! Please type correct value! (60-90)");
                int speedCorrect = speed;
                speedCorrect = sc.nextInt();
                speed = speedCorrect;
            }
            bus.setSpeed(speed);

            System.out.println("Input bus number code:");
            String code = sc.nextString();
            bus.setCode(code);

            System.out.println("Input bus number:");
            int number = sc.nextInt();
            while (number <= 999 || number >= 9999) {
                System.out.println("Error! Please type correct value! (4 digits)");
                int numberCorrect = number;
                numberCorrect = sc.nextInt();
                number = numberCorrect;
            }
            bus.setNumber(number);

            System.out.println("Input bus fare:");
            double fare = sc.nextDouble();
            bus.setFare(fare);

            System.out.println("Input bus tank volume:");
            int tankVolume = sc.nextInt();
            while (tankVolume <= 209 || tankVolume >= 401) {
                System.out.println("Error! Please type correct value! (210-400)");
                int tankVolumeCorrect = tankVolume;
                tankVolumeCorrect = sc.nextInt();
                tankVolume = tankVolumeCorrect;
            }
            bus.setTankVolume(tankVolume);


            System.out.println("Element updated successfully!");


        } else {
            if (array[choice].getClass() == trolleybus.getClass()) {
                array[choice] = trolleybus;

                System.out.println("Input trolleybus capacity:");
                int capacity = sc.nextInt();
                while (capacity <= 49 || capacity >= 101) {
                    System.out.println("Error! Please type correct value! (50-100)");
                    int capacityCorrect = capacity;
                    capacityCorrect = sc.nextInt();
                    capacity = capacityCorrect;
                }
                trolleybus.setCapacity(capacity);

                System.out.println("Input trolleybus speed:");
                int speed = sc.nextInt();
                while (speed <= 59 || speed >= 91) {
                    System.out.println("Error! Please type correct value! (60-90)");
                    int speedCorrect = speed;
                    speedCorrect = sc.nextInt();
                    speed = speedCorrect;
                }
                trolleybus.setSpeed(speed);


                System.out.println("Input trolleybus number code:");
                String code = sc.nextString();
                trolleybus.setCode(code);


                System.out.println("Input trolleybus number:");
                int number = sc.nextInt();
                while (number <= 999 || number >= 9999) {
                    System.out.println("Error! Please type correct value! (4 digits)");
                    int numberCorrect = number;
                    numberCorrect = sc.nextInt();
                    number = numberCorrect;
                }
                trolleybus.setNumber(number);

            /*
            System.out.println("Input trolleybus fare:");
            double fare = sc.nextDouble();
            trolleybus.setFare(fare);
             */

                System.out.println("Input trolleybus lines voltage:");
                int linesVoltage = sc.nextInt();
                while (linesVoltage <= 549 || linesVoltage >= 601) {
                    System.out.println("Error! Please type correct value! (550-600)");
                    int linesVoltageCorrect = linesVoltage;
                    linesVoltageCorrect = sc.nextInt();
                    linesVoltage = linesVoltageCorrect;
                }
                trolleybus.setLinesVoltage(linesVoltage);

                System.out.println("Element updated successfully!");

            }
        }
    }

    private void deleteElement() {
        System.out.println("Input index");
        int choice = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[choice]) {
                array[i] = null;

            }

        }
        System.out.println("Element deleted successfully!");
    }


    private void printAll() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
             System.out.println(array[i]);
        }

    }

}




