package com.company.lab3;

public class Trolleybus extends PublicTransport {

    private int linesVoltage = 600;


    public Trolleybus(int capacity, int speed, String code, int number, double fare, int linesVoltage) {
        super(capacity, speed, code, number, fare);
        this.linesVoltage = linesVoltage;
    }

    public void set_linesVoltage(int linesVoltage) {
        this.linesVoltage = linesVoltage;
    }

    public int get_linesVoltage() {
        return linesVoltage;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Trolleybus other = (Trolleybus) obj;
        return getCapacity() == other.getCapacity() &&
                getSpeed() == other.getSpeed() &&
                getCode().equals(other.getCode()) &&
                getNumber() == (other.getNumber()) &&
                getFare() == other.getFare() &&
                get_linesVoltage() == other.get_linesVoltage();
    }

    // привязал значение хэшкода к номеру транспортного средства, уповая на то, что у всех транспортных средст он будет уникален
    @Override
    public int hashCode() {
        return getNumber();
    }

    @Override
    public String toString() {
        return "Троллейбус №:" + getCode() + "-" + getNumber() + "(" + "скорость:" + getSpeed() + ";" + "вместительность:" + getCapacity()
                +";" + "напряжение линии:" + get_linesVoltage() + ";" + "стоимость проезда:" + getFare() + " рублей)";
    }


}
