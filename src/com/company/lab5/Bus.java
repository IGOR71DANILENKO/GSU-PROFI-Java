package com.company.lab5;

public class Bus extends PublicTransport {

    private int tankVolume;

    public Bus(int capacity, int speed, String code, int number, double fare, int tankVolume) {
        super(capacity, speed, code, number, fare);
        this.tankVolume = tankVolume;
    }



    public void setTankVolume(int tankVolume) {
    this.tankVolume = tankVolume;
    }

    public int getTankVolume() {
        return tankVolume;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
       Bus other = (Bus)obj;
       return super.equals(other) &&
               getTankVolume() == other.getTankVolume();
    }

    // привязал значение хэшкода к номеру транспортного средства, уповая на то, что у всех транспортных средств он будет уникален
    @Override
    public int hashCode() {
        return getNumber();
    }



    @Override
    public String toString() {
        return "Автобус №:" + getCode() + "-" + getNumber() + "(" + "скорость:" + getSpeed() + ";" + "вместительность:" + getCapacity()
                +";" + "объем бака:" + getTankVolume() + ";" + "стоимость проезда:" + getFare() + " рублей)";

    }





}
