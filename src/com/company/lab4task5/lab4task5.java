package com.company.lab4task5;
import java.util.Scanner;

public class lab4task5 {
    public static void main(String[] args) {
        //Задание: Дан массив слов. Заменить последние три символа слов, имеющих выбранную длину на символ "$".

        String[] words = new String[] {"крокодил", "кролик", "заяц", "свинья", "осел", "курица", "петух", "таракан"};
        //задали массив слов

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int counter = in.nextInt();


        int j = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[j].length() == counter) { //задано условие поиска слов по количеству символов
                String last3 = words[j].substring(words[j].length()-3); //строка получает значения последних трех символов указанного слова
                String last3$ = "$$$";
                String output = words[j].replace(last3, last3$); //меняют три последних символа на три бакса
                System.out.println(output);
            }
            j++;
        }


    }
}
