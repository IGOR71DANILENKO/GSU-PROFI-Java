package com.company.lab4task4;
import java.util.Scanner;

public class lab4task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String line = in.nextLine();                      //пользовательский ввод
        String line2 = line.trim();                       //избавились от пробелов в начале и конце

        StringBuffer line2line = new StringBuffer(line2);
        for (int i = 0; i < line2line.length(); i++) {
            int j = line2line.indexOf(" ");
            if (j < 0) break;
            line2line = line2line.deleteCharAt(j);
        }                                                 //этим циклом удалов удалить пробелы из середины строки

        System.out.println("Строка после удаления пробелов:");
        System.out.println(line2line);                    //выводим на экран строку после удаления пробелов

        System.out.println("-------------------------"); // для визуального удобства просмотра результата в консоли
        String finalLine1 = line2line.toString();        // дублируем значение строки в другой строке перед reverse
        StringBuffer finalLine = line2line.reverse();    // делаем реверс строки
        String finalLine2 = finalLine.toString();        // и сразу же преобразуем результат в строчный тип


        System.out.println(finalLine1);   // вывел обе строки для визуального сравнения и проверки самого себя
        System.out.println(finalLine2);

        boolean truth = finalLine1.equals(finalLine2); // не знаю насколько это продуктивно, но решил здесь булиновский
        // тип применить

        if (truth) {
            System.out.println("Строки являются палиндромами");
        } else {
            System.out.println("Строки НЕ являются палиндромами");
        }

        //раз 100500 игрался с различными вводами, вроде работает таким макаром
        //и за названия вроде line2line извините )

    }
}

