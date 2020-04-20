package com.company.lab5;
import java.util.Scanner;

public class ScannerWrapper {

    private Scanner sc = new Scanner(System.in);

    public String nextString() {
        return sc.nextLine();
    } // пользовательский ввод строк

    public int nextInt() {
        return sc.nextInt();
    }  // пользовательский ввод чисел

    public double nextDouble() { return sc.nextDouble(); } // пользовательский ввод дробных чисел




}
