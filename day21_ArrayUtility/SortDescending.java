package day21_ArrayUtility;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {

        int i =0;
        int [] numbers  = {2,5,7,1,6,9,3};
        int [] reversed = new int [numbers.length];
        Arrays.sort(numbers);
        for (int i1 = numbers.length-1; i1 >=0;   i1--, i++) {
            reversed[i] = numbers[i1];

        }
        System.out.println(Arrays.toString(reversed));
        }


    }

   // Write a program that sort the array of integer in descending order