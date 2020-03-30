package com.company.lab3;

public abstract class PublicTransport {
    int capacity = 50;
    int speed;

    private double billCost;

    public double getBillCost() {
        return billCost;
    }

    public void setBillCost(double billCost) {
        this.billCost = billCost;
    }

    private int conductor;

    public int getConductor() {
        return conductor;
    }

    public void setConductor(int conductor) {
        this.conductor = conductor;
    }

    public boolean conductorPresence() {
        return conductor == 1;
    }



    PublicTransport () {

    }

}

