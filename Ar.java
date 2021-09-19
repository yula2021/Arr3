package org.itstep;

import java.util.Arrays;

public class Ar {
    //двумерный массив
    public static int numRols = 5;
    public static int numCols = 6;
    private static int[][] Arr = new int[numRols][numCols];

    public static void main(String[] args) {
        fillOrder();
        System.out.println(arrtoString());

    }

    public static void fillOrder() {
        for (int i = 0; i < numRols; i++)
            for (int j = 0; j < numCols; j++)
                Arr[i][j] = j + 1 + i * numCols;
        //System.out.println(Arrays.toString(Arr));

    }

    public static String arrtoString() {
        StringBuilder result = new StringBuilder();
        String separator = " , ";
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                result.append(Arr[i][j]);
                if (j != Arr[i].length - 1)
                    result.append(separator);
            }
            result.append("\n");
        }

        return result.toString();
    }

    //Преобразовать в строку с выравниванием
    public static String arrToStringAligned() {
        StringBuilder result = new StringBuilder();
        String pad = "     ";
        for (int i = 0; i < numRols; i++) {
            for (int j = 0; j < numCols; j++) {
                String sNumber = Integer.toString(Arr[i][j]);
                String sPadded = pad.substring(sNumber.length()) + sNumber;
                if (j == 0) result.append(sNumber);
                else
                    result.append(sPadded);
            }
            result.append("\n");
        }
        return result.toString();
    }
    //выравнивание вертикальное
    public static void fillOrderUD() {
        for (int i = 0; i < numRols; i++)
            for (int j = 0; j < numCols; j++)
                Arr[i][j] = i + 1 + j * numCols; //ошибка
        System.out.println(Arr);
    }

}
