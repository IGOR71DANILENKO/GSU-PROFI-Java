package com.company.lab3;

public class Bus extends PublicTransport {

    private int tankVolume = 90;
    private String busNumber;

    public void set_busNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String get_busNumber() {
        return busNumber;
    }

    public void set_tankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public int get_tankVolume() {
        return tankVolume;
    }

    public Bus(int capacity, int speed) {
        this.capacity = capacity;
        this.speed = speed;
        setConductor(1);
        set_busNumber("5000 AC-7");
        set_tankVolume(100);
        setBillCost(.60);
    }

    public String bus_toString() {
        if (conductorPresence()) {
            return "Номер автобуса: " + get_busNumber() + "; " + "Скорость автобуса: " + speed + "; " + "Вместительность автобуса: " + capacity + "; " +
                    "Объем бака: " + get_tankVolume() + "; " + '\n' + "В салоне присутствует кондуктор!" + '\n' + "Стоимость проезда: " + getBillCost() + " рублей.";
        } else return "Номер автобуса: " + get_busNumber() + "; " + "Скорость автобуса: " + speed + "; " + "Вместительность автобуса: " + capacity + "; " +
                "Объем бака: " + get_tankVolume() + "; "+ '\n' + "Автобус осуществляет движение по маршруту без кандуктора, приобретайте билеты у водителя!"
                + '\n' + "Стоимость проезда: " + getBillCost() + " рублей.";
    }


}
