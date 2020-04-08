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
        System.out.println("0 - print all");
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
        }
    }

    private void addElement() {
        array[count++] = new Bus(60,50,"AI",99934,0.60,100);
    }

    private void updateElement() {
        System.out.println("Input index");
        int choice = sc.nextInt();
    }

    private void deleteElement() {

    }

    private void printAll() {

    }

}




