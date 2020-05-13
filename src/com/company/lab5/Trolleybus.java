package com.company.lab5;

public class Trolleybus extends PublicTransport {

    private int linesVoltage = 600;


    public Trolleybus(int capacity, int speed, String code, int number, double fare, int linesVoltage) {
        super(capacity, speed, code, number, fare);
        this.linesVoltage = linesVoltage;
    }

    public void setLinesVoltage(int linesVoltage) {
        this.linesVoltage = linesVoltage;
    }
    public int getLinesVoltage() {
        return linesVoltage;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Trolleybus other = (Trolleybus) obj;
        return super.equals(other) &&
               getLinesVoltage() == other.getLinesVoltage();
    }

    // привязал значение хэшкода к номеру транспортного средства, уповая на то, что у всех транспортных средств он будет уникален
    @Override
    public int hashCode() {
        return getNumber();
    }

    @Override
    public String toString() {
        return "Троллейбус №:" + getCode() + "-" + getNumber() + "(" + "скорость:" + getSpeed() + ";" + "вместительность:" + getCapacity()
                +";" + "напряжение линии:" + getLinesVoltage() + ";" + "стоимость проезда:" + getFare() + " рублей)";
    }

    public String toProtocolString() {
        return "t|" + super.toProtocolString() + "|" + getLinesVoltage() + "---";
    }


}
