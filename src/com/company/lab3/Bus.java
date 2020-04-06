package com.company.lab3;

import java.util.Objects;

public class Bus extends PublicTransport {

    private int tankVolume;

    public Bus(int capacity, int speed, String code, int number, double fare, int tankVolume) {
        super(capacity, speed, code, number, fare);
        this.tankVolume = tankVolume;
    }



    public void set_tankVolume(int tankVolume) {
    this.tankVolume = tankVolume;
    }

    public int get_tankVolume() {
        return tankVolume;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
       Bus other = (Bus)obj;
       return getCapacity() == other.getCapacity() &&
               getSpeed() == other.getSpeed() &&
               getCode().equals(other.getCode()) &&
               getNumber() == (other.getNumber()) &&
               getFare() == other.getFare() &&
               get_tankVolume() == other.get_tankVolume();
    }

    // привязал значение хэшкода к номеру транспортного средства, уповая на то, что у всех транспортных средств он будет уникален
    @Override
    public int hashCode() {
        return getNumber();
    }



    @Override
    public String toString() {
        return "Автобус №:" + getCode() + "-" + getNumber() + "(" + "скорость:" + getSpeed() + ";" + "вместительность:" + getCapacity()
                +";" + "объем бака:" + get_tankVolume() + ";" + "стоимость проезда:" + getFare() + " рублей)";

    }





}
