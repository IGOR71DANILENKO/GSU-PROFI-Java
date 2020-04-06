package com.company.lab3;
import java.util.HashSet;
import java.util.Set;

public class OOP_main {

    public static void main(String[] args) {

        //проверка реализации equals и hashCode

        Bus f1 = new Bus (60,50, "AI", 55551, 0.60, 100);
        Bus f2 = new Bus (60, 50, "AI",53551, 0.60, 100);

        System.out.println(f1.equals(f2));

        Set<Bus> set = new HashSet<>();
        set.add(f1);
        set.add(f2);

        System.out.println(set.size());
        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());




    }


}