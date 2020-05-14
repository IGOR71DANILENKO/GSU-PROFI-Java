package com.company.lab4task7;
import java.util.Scanner;

public class lab4task7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово:");
        String word = in.nextLine();

        if (word.charAt(0) == 'a' && word.charAt(1) == 'b' && word.charAt(2) == 'c')
            word = "www" + word.substring(3,word.length());
        else {
         word = word + "zzz";
        }
        System.out.println(word);
        }
    }

