package com.company.lab4task3;

public class lab4task3 {
    public static void main(String[] args) {
        String input = "abc cde def";
        StringBuffer in = new StringBuffer(input);

        System.out.println(in);

        for (int i = 0; i < in.length(); i++) {
            int j = in.indexOf(" ");
            if (j < 0) break;   //При проверке дебаггером моего цикла, после удаления двух пробелов (" "), j почему-то приняло
            in.deleteCharAt(j); //значение -1 и цикл на этом прерывался, именно поэтому и добавил if
        }

        System.out.println(in);


        int k = 0;                    // НЕОБХОДИМО ПРИДУМАТЬ УСЛОВИЕ УДАЛЕНИЯ СХОЖИХ СИМВОЛОВ
        for (int i = 0; i < in.length(); i++) {
            k++;
            char j = in.charAt(k);

        }



        System.out.println(in);
    }
}
