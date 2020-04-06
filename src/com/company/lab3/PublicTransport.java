package com.company.lab3;

public abstract class PublicTransport extends Object {

    private int capacity;
    private int speed;
    private String number;
    private double fare;

    public PublicTransport(int capacity, int speed, String number, double fare) {
        this.capacity = capacity;
        this.speed = speed;
        this.number = number;
        this.fare = fare;
    }


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

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        PublicTransport that = (PublicTransport) obj;

        if (number != that.number) return false;
        return number != null ? number.equals(that.number) : that.number == null;
    }

    @Override
    public int hashCode() {
        int result = capacity;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }



}

