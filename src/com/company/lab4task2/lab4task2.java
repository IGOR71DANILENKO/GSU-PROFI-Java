package com.company.lab4task2;
import java.util.Scanner;

public class lab4task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String line = in.nextLine();

        System.out.println("Введите подстроку, которую хотите заменить:");
        String line1 = in.nextLine();

        System.out.println("Введите новую подстроку:");
        String line2 = in.nextLine();

        String result = line.replace(line1, line2);
        System.out.println("Результирующая строка: ");
        System.out.println(result);
    }
}
