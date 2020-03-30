package com.company.lab1;

public class lab1 {

    public static void main(String[] args) {
        double x = 1;
        double a = 2;
        double b = 3;
        double u = 10;
        double result;

        if (x < a) {
            result = Math.log(x + u / (5 * x));
        } else if (x >= a && x <= b) {
            result = Math.pow(Math.E, -x) / (x - 10 * u);
        } else {
            result = Math.tan(Math.PI * (x + u));
        }

        System.out.println(result);
    }
}
