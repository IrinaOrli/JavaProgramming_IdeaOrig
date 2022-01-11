package day21_MultiDimansionalArray;

import java.util.Arrays;

public class MinimumMaximumNumbers {
    public static void main(String[] args) {

        int [][] arr2D = { {1,2,3},{4,5,6},{7,8,9} };
        int length = 0;
        for (int[] i1 : arr2D) {
            for (int i : i1) {
                length++;
            }
        }
        int[] arr1D = new int[length];

        int i = 0;
        for (int[] each1D : arr2D) {
            for (int element : each1D) {
                arr1D[i] = element;
                i++;
            }

        }
        Arrays.sort(arr1D);
        int min = arr1D[0];
        int max = arr1D[arr1D.length-1];

        System.out.println(Arrays.toString(arr1D));
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
/* Write a program that can find the minimum and maximum numbers from a two dimensional array
* */