package com.company.lab5;

public class TransportFactory {

    private ScannerWrapper sc = new ScannerWrapper();
    private PublicTransport[] array = new PublicTransport[100];
    public int count = 0;
    private PublicTransportContainer storage = new PublicTransportContainer();



    public void create() {
        System.out.println("1 - create Bus");
        System.out.println("2 - create Trolleybus");

        int choice = sc.nextInt();

        if (choice == 1) {
            createBus();
        } else {
            createTrolleybus();
        }

    }

    public void createBus() {
        Bus bus = new Bus(0,0,"AI",99934,0.60,100);
        //   array[count++] = bus;


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
        String codeTest = sc.nextString();
        String code = sc.nextString();
        bus.setCode(code);

        System.out.println("Input bus number:");
        int number = sc.nextInt();
        while (number <= 999 || number >= 10000) {
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

        storage.add(bus);
    }

    public void createTrolleybus() {
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
        while (number <= 999 || number >= 10000) {
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

      storage.add(trolleybus);

        }

    public void updateElement() {
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
             while (number <= 999 || number >= 10000) {
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
                 while (number <= 999 || number >= 10000) {
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

    public void deleteElement() {
        System.out.println("Input index");
        int choice = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[choice]) {
                array[i] = null;

            }

        }
        System.out.println("Element deleted successfully!");
    }

    public void printAll() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
                System.out.println(array[i]);
        }
    }

    }

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


