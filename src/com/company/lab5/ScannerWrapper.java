package com.company.lab5;
import java.util.Scanner;

public class ScannerWrapper {

    private Scanner sc = new Scanner(System.in);

    public String nextLine() {
        return sc.nextLine();
    }

    public int nextInt() {
        return sc.nextInt();
    }


}
