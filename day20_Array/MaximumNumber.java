package day20_Array;

import java.util.Arrays;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] number = {10, 5, 4, 1, 0};
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }

        }
        System.out.println(max);
    }
}