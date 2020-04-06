package com.company.lab3;

public class Bus extends PublicTransport {

    private int tankVolume;

    public void set_tankVolume(int tankVolume) {
    this.tankVolume = tankVolume;
    }

    public int get_tankVolume() {
        return tankVolume;
    }

    public Bus(int capacity, int speed, String number, double billCost, int tankVolume) {
        super(capacity, speed, number, billCost);
        this.tankVolume = tankVolume;

    }


    @Override
    public String toString() {
        return "Автобус №:" + getNumber() + "(" + "скорость:" + getSpeed() + ";" + "вместительность:" + getCapacity()
                +";" + "объем бака:" + get_tankVolume() + ";" + "стоимость проезда:" + getBillCost() + " рублей)";

    }
}
