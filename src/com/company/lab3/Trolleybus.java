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

    public Trolleybus(int capacity, int speed) {
        this.capacity = capacity;
        this.speed = speed;
        setConductor(1);
        set_trolleybusNumber("5000 AC-7");
        set_linesVoltage(600);
        setBillCost(.65);
    }

    public String trolleybus_toString() {
        if (conductorPresence()) {
            return "Номер троллейбуса: " + get_trolleybusNumber() + "; " + "Скорость троллейбуса: " + speed + "; " + "Вместительность троллейбуса: " + capacity + "; " +
                    "Напряжение линии: " + get_linesVoltage() + "; " + '\n' + "В салоне присутствует кондуктор!" + '\n' + "Стоимость проезда: " + getBillCost() + " рублей.";
        } else return "Номер троллейбуса: " + get_trolleybusNumber() + "; " + "Скорость троллейбуса: " + speed + "; " + "Вместительность троллейбуса: " + capacity + "; " +
                "Напряжение линии: " + get_linesVoltage() + "; " + '\n' + "Троллейбус осуществляет движение по маршруту без кандуктора, приобретайте билеты у водителя!"
                + '\n' + "Стоимость проезда: " + getBillCost() + " рублей.";
    }


}
