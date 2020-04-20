package com.company.lab5;


public class Menu {

    private ScannerWrapper sc = new ScannerWrapper();
    private PublicTransportContainer storage = new PublicTransportContainer();
    private TransportFactory creator = new TransportFactory();

    //меню
    private void printHelp() {
        System.out.println("1 - add element");
        System.out.println("2 - update element");
        System.out.println("3 - delete element");
        System.out.println("4 - print all");
        System.out.println("0 - exit");
        System.out.println("---------------------");
        System.out.println("Введите число (от 0 до 4, в сооответствии с пунктами меню):");
    }

    //фактически - главный метод программы
    public void run() {
        printHelp();
        while (true) {
                int choice = sc.nextInt();
                    //исключение ввода пользователем неверных значений
                    while (choice <= -1 || choice >= 5) {
                        System.out.println("Error! Please type correct value! (0-4)");
                        int choiceCorrect = choice;
                        choiceCorrect = sc.nextInt();
                        choice = choiceCorrect;
                    }

                    //обработка команд, в соответствии с пунктами меню
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

    //методы CRUD
    private void addElement() {
        creator.create();
        System.out.println("Element added successfully!");
    }

    private void updateElement() {
        creator.updateElement();
        System.out.println("Element updated successfully!");
    }

    private void deleteElement() {
        creator.deleteElement();
        System.out.println("Element deleted successfully!");
    }

    private void printAll() {
        creator.printAll(); // вот так - работает
        // а если вызывать storage.printArray(), то при распечатке не показываются созданные объекты
    }

}




