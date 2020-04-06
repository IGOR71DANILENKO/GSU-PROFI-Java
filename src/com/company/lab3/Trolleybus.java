package com.company.lab3;

public class Trolleybus extends PublicTransport {

    private int linesVoltage = 600;
    private String trolleybusNumber;

    public void set_trolleybusNumber(String trolleybusNumber) {
        this.trolleybusNumber = trolleybusNumber;
    }

    public String get_trolleybusNumber() {
        return trolleybusNumber;
    }


    public void set_linesVoltage(int linesVoltage) {
        this.linesVoltage = linesVoltage;
    }

    public int get_linesVoltage() {
        return linesVoltage;
    }

    public Trolleybus(int capacity, int speed, String number, double billCost, int linesVoltage) {
        super(capacity, speed, number, billCost);
        this.linesVoltage = linesVoltage;
    }

    @Override
    public String toString() {
        return "Троллейбус №:" + getNumber() + "(" + "скорость:" + getSpeed() + ";" + "вместительность:" + getCapacity()
                +";" + "напряжение линии:" + get_linesVoltage() + ";" + "стоимость проезда:" + getBillCost() + " рублей)";
    }


}
