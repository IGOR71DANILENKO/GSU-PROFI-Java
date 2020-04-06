package com.company.lab3;

public abstract class PublicTransport {

    private int capacity;
    private int speed;
    private String number;
    private double billCost;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBillCost() {
        return billCost;
    }

    public void setBillCost(double billCost) {
        this.billCost = billCost;
    }



    public PublicTransport(int capacity, int speed, String number, double billCost) {
        this.capacity = capacity;
        this.speed = speed;
        this.number = number;
        this.billCost = billCost;
        }

}

