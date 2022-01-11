package day21_MultiDimansionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionArrays {
    public static void main(String[] args) {

        int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} };
        for (int i = 0; i < arr2D.length; i++) { // i -index of nimbers of single dim array
                int [] eachArray = arr2D[i];

            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D [i][j] + " ");
            }
            System.out.println(); // to print in separate lines


          /*  for (int i1 = 0; i1 < eachArray.length; i1++) {
                System.out.print(eachArray[i1] + " ");*/
            }


            //System.out.println(Arrays.toString(arr2D[i]));
        System.out.println("=============");

        }

        }






