package com.company.lab2task1;
import java.util.Arrays;

public class lab2task1 {

    public static void main(String[] args) {

        int[][] arrayMATRIX = {{2, 4, 5, 2, 6}, {4, 9, 1, 6, 3}, {5, 16, 6, 38, 1}, {1, 2, 3, 4, 5}, {7, 3, 4, 5, 5}};
        int maxELEMENT = arrayMATRIX[0][0];
        int maxI = 0;
        int maxJ = 0;

        System.out.println("Исходная матрица");

        for (int i = 0; i < arrayMATRIX.length; i++) {
            for (int j = 0; j < arrayMATRIX[i].length; j++) {
                System.out.print(arrayMATRIX[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < arrayMATRIX.length; i++) {
            for (int j = 0; j < arrayMATRIX[i].length; j++) {
                if (arrayMATRIX[i][j] > maxELEMENT) {
                    maxELEMENT = arrayMATRIX[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println("Максимальный элемент матрицы: " + maxELEMENT);

        System.out.println(maxELEMENT);
        System.out.println(maxI);
        System.out.println(maxJ);


        int[] result = new int[arrayMATRIX.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = arrayMATRIX[maxI][i] * arrayMATRIX[i][maxJ];
        }
        System.out.println(Arrays.toString(result));

    }
}

