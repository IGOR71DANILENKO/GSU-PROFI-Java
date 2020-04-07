package com.company.lab3;

import java.util.Objects;

public abstract class PublicTransport extends Object {

    private int capacity; //вместительность
    private int speed;    //скорость
    private String code;  // двухбуквенный код автомобильного номера
    private int number;   // четырехзначный номер
    private double fare;  // стоимость проезда

    public PublicTransport(int capacity, int speed, String code, int number, double fare) {
        this.capacity = capacity;
        this.speed = speed;
        this.code = code;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
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
        PublicTransport other = (PublicTransport) obj;
        return capacity == other.capacity &&
                speed == other.speed &&
                code.equals(other.code) &&
                number == other.number &&
                fare == other.fare;
        }

    // привязал значение хэшкода к номеру транспортного средства, уповая на то, что у всех транспортных средств он будет уникален
    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public String toString() {
        return "Транспортное средство №:" + getCode() + "-" + getNumber() + "(" + "скорость:" + getSpeed() + ";" + "вместительность:" + getCapacity()
                +";" + ";" + "стоимость проезда:" + getFare() + " рублей)";
    }

}

