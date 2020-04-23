package com.company.lab5;

import java.util.ArrayList;

public class TransportFactory {

    private ScannerWrapper sc = new ScannerWrapper();
    private ArrayList<PublicTransport> base = new ArrayList<PublicTransport>();

    public int count = 0;

    public void insertCapacity() {

    }

    public void insertSpeed() {

    }

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

        //создание "пустого автобуса"
       Bus bus = new Bus(0,0,"",0,0.60,0);

        //пользовательский ввод параметра вместительности автобуса
        System.out.println("Input capacity:");
        int capacity = sc.nextInt();
        while (capacity <= 49 || capacity >= 101) {
            System.out.println("Error! Please type correct value! (50-100)");
            int capacityCorrect = sc.nextInt();
            capacity = capacityCorrect;
        }
        bus.setCapacity(capacity);

        //пользовательский ввод параметра скорости автобуса
        System.out.println("Input speed:");
        int speed = sc.nextInt();
        while (speed <= 59 || speed >= 91) {
            System.out.println("Error! Please type correct value! (60-90)");
            int speedCorrect = sc.nextInt();
            speed = speedCorrect;
        }
        bus.setSpeed(speed);

        //пользовательский ввод серии госномера автобуса
        System.out.println("Input bus number code:");
        String codeTest = sc.nextString();
        String code = sc.nextString();
        bus.setCode(code);

        //пользовательский ввод цифр госномера автобуса
        System.out.println("Input bus number:");
        int number = sc.nextInt();
        while (number <= 999 || number >= 10000) {
            System.out.println("Error! Please type correct value! (4 digits)");
            int numberCorrect = number;
            numberCorrect = sc.nextInt();
            number = numberCorrect;
        }
        bus.setNumber(number);

        //пользовательский ввод стоимости проезда
        System.out.println("Input bus fare:");
        double fare = sc.nextDouble();
        bus.setFare(fare);

        //пользовательский ввод параметра ёмкости бака автобуса
        System.out.println("Input bus tank volume:");
        int tankVolume = sc.nextInt();
        while (tankVolume <= 209 || tankVolume >= 401) {
            System.out.println("Error! Please type correct value! (210-400)");
            int tankVolumeCorrect = tankVolume;
            tankVolumeCorrect = sc.nextInt();
            tankVolume = tankVolumeCorrect;
        }
        bus.setTankVolume(tankVolume);

        //заполнение массива класса-контейнера новым объектом

        base.add(bus);

    }

    public void createTrolleybus() {
        Trolleybus trolleybus = new Trolleybus(0, 0, "", 0, 0.60, 0);
//        array[count++] = trolleybus;

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
        String codeTest = sc.nextString();
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


        System.out.println("Input trolleybus fare:");
        double fare = sc.nextDouble();
        trolleybus.setFare(fare);


        System.out.println("Input trolleybus lines voltage:");
        int linesVoltage = sc.nextInt();
        while (linesVoltage <= 549 || linesVoltage >= 601) {
            System.out.println("Error! Please type correct value! (550-600)");
            int linesVoltageCorrect = linesVoltage;
            linesVoltageCorrect = sc.nextInt();
            linesVoltage = linesVoltageCorrect;
        }
        trolleybus.setLinesVoltage(linesVoltage);


        base.add(trolleybus);

        }

    public void updateElement() {
         System.out.println("Input index");
         int choice = sc.nextInt();
         Bus bus = new Bus(0, 0, "", 0, 0.6, 0);
         Trolleybus trolleybus = new Trolleybus(0, 0, "", 0, 0.6, 0);
         if (base.get(choice).getClass() == bus.getClass()) {
             base.set(choice, bus);


             //пользовательский ввод параметра вместительности автобуса
             System.out.println("Input bus capacity:");
             int capacity = sc.nextInt();
             while (capacity <= 49 || capacity >= 101) {
                 System.out.println("Error! Please type correct value! (50-100)");
                 int capacityCorrect = capacity;
                 capacityCorrect = sc.nextInt();
                 capacity = capacityCorrect;
             }
             bus.setCapacity(capacity);

             //пользовательский ввод параметра скорости автобуса
             System.out.println("Input bus speed:");
             int speed = sc.nextInt();
             while (speed <= 59 || speed >= 91) {
                 System.out.println("Error! Please type correct value! (60-90)");
                 int speedCorrect = speed;
                 speedCorrect = sc.nextInt();
                 speed = speedCorrect;
             }
             bus.setSpeed(speed);

             //пользовательский ввод серии госномера автобуса
             System.out.println("Input bus number code:");
             String codeTest = sc.nextString();
             String code = sc.nextString();
             bus.setCode(code);

             //пользовательский ввод цифр госномера автобуса
             System.out.println("Input bus number:");
             int number = sc.nextInt();
             while (number <= 999 || number >= 10000) {
                 System.out.println("Error! Please type correct value! (4 digits)");
                 int numberCorrect = number;
                 numberCorrect = sc.nextInt();
                 number = numberCorrect;
             }
             bus.setNumber(number);

             //пользовательский ввод стоимости проезда
             System.out.println("Input bus fare:");
             double fare = sc.nextDouble();
             bus.setFare(fare);

             //пользовательский ввод параметра ёмкости бака автобуса
             System.out.println("Input bus tank volume:");
             int tankVolume = sc.nextInt();
             while (tankVolume <= 209 || tankVolume >= 401) {
                 System.out.println("Error! Please type correct value! (210-400)");
                 int tankVolumeCorrect = tankVolume;
                 tankVolumeCorrect = sc.nextInt();
                 tankVolume = tankVolumeCorrect;
             }
             bus.setTankVolume(tankVolume);

         } else {
             if (base.get(choice).getClass() == bus.getClass()) {
                 base.set(choice, trolleybus);

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
                 String codeTest = sc.nextString();
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


                 System.out.println("Input trolleybus fare:");
                 double fare = sc.nextDouble();
                 trolleybus.setFare(fare);


                 System.out.println("Input trolleybus lines voltage:");
                 int linesVoltage = sc.nextInt();
                 while (linesVoltage <= 549 || linesVoltage >= 601) {
                     System.out.println("Error! Please type correct value! (550-600)");
                     int linesVoltageCorrect = linesVoltage;
                     linesVoltageCorrect = sc.nextInt();
                     linesVoltage = linesVoltageCorrect;
                 }
                 trolleybus.setLinesVoltage(linesVoltage);

             }
         }
        }

    public void deleteElement() {
        System.out.println("Input index");
        int choice = sc.nextInt();
        base.remove(choice);
        System.out.println("Element deleted successfully!");
        }

    public void printAll() {
        System.out.println(base);
        }

}




