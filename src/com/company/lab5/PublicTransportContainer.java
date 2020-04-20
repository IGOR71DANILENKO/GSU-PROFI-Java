package com.company.lab5;

public class PublicTransportContainer {

    public PublicTransport[] arrayMain = new PublicTransport[100];
    public int count = 0;


    PublicTransport object;
    public void add(PublicTransport object) {
        arrayMain[count++] = object;
    }

    public void printArray() {
        for (int i = 0; i < arrayMain.length; i++) {

            if (arrayMain[i] != null)
                System.out.println(arrayMain[i]);

        }
    }
}

//    public void add(PublicTransport element) {
//        array[count++] = element;
//    }
//
//    public void update(int index, PublicTransport element) {
//        array[index] = element;
//    }
//
//    public void delete(int index) {
//        for (int i = index; i < count - 1; i++) {
//            array[i] = array[i + 1];
//        }
//        count--;
//    }
//
//    public PublicTransport[] getArray() {
//        return array;
//    }
//
//    public int size() {
//        return count;
//    }

