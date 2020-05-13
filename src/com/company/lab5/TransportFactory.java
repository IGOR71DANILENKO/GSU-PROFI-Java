package com.company.lab5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TransportFactory {

    private ScannerWrapper sc = new ScannerWrapper();
    private ArrayList<PublicTransport> base = new ArrayList<PublicTransport>();



       /*
    public void fileContent() {
        int t = 0;
        for (int i = 0; i < base.size(); i++) {

            System.out.println(base.get(t));
            t++;
        }

    }


     */

    public void writeFile() {
        try(FileWriter writer = new FileWriter("base.txt", false)) {

            int i = 0;

            for (i = 0; i < base.size(); i++) {
                writer.write(base.get(i).toProtocolString());
//                writer.write("\n");
                }
            i++;


            writer.flush();


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void loadFile() {
        try (FileReader reader = new FileReader("base.txt")) {
            int c;
            String targetString = "";

            //внесли содержимое base.txt в строку targetString
            while((c = reader.read()) != -1) {
                targetString += (char) c;
                }


            //разделили targetString по объектам, массив string хранит записи объектов посимвольно
            String[] string = targetString.split("---");



            // цикл, "пробегающий по всем объектам"
            for (int i = 0; i < string.length; i++) {
                if ('b' == (string[i].charAt(0))) {
                    Bus bus = new Bus(0, 0, "", 0, 0, 0);
                    String[] stringDivider = string[i].split("\\|");

                    bus.setCapacity(Integer.parseInt(stringDivider[3]));
                    bus.setSpeed(Integer.parseInt(stringDivider[4]));
                    bus.setCode(stringDivider[1]);
                    bus.setNumber(Integer.parseInt(stringDivider[2]));
                    bus.setFare(Double.parseDouble(stringDivider[5]));
                    bus.setTankVolume(Integer.parseInt(stringDivider[6]));

                    base.add(bus);

                } else if ('t' == (string[i].charAt(0))) {
                    Trolleybus trolleybus = new Trolleybus(0, 0, "", 0, 0, 0);
                    String[] stringDivider = string[i].split("\\|");

                    trolleybus.setCapacity(Integer.parseInt(stringDivider[3]));
                    trolleybus.setSpeed(Integer.parseInt(stringDivider[4]));
                    trolleybus.setCode(stringDivider[1]);
                    trolleybus.setNumber(Integer.parseInt(stringDivider[2]));
                    trolleybus.setFare(Double.parseDouble(stringDivider[5]));
                    trolleybus.setLinesVoltage(Integer.parseInt(stringDivider[6]));


                    base.add(trolleybus);

                }
            }




        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }




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

        int i;
        for (i = 0 ; i < base.size(); i++) {
            System.out.println(base.get(i));
            }
        i++;
        }

}




