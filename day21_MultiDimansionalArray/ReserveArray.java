package day21_MultiDimansionalArray;

import java.util.Arrays;

public class ReserveArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
           int[][] reversed = new int[2][3];

            for (int i = array.length - 1, a = 0; i >= 0; i--, a++) {
                for (int j = array[i].length - 1, b = 0; j >= 0; j--, b++) {
                    reversed[a][b] = array[i][j];
                }
            }
            System.out.println((Arrays.deepToString(reversed)));


        }
    }



/*Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};*/