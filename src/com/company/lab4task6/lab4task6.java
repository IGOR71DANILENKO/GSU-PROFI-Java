package com.company.lab4task6;
import java.util.Scanner;

public class lab4task6 {
    public static void main(String[] args) {

        //пользовательский ввод необходимого слова
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово (на английском языке):");
        String word = in.nextLine();


        int i = 0;
        for (int j = 0; j < word.length(); j++) {

            char a = word.charAt(i);
            char b = (char) (a + 1);
            word = word.replace(a,b);

            i++;
        }


        System.out.println("Полученное слово:");
        System.out.println(word);
    }
}
