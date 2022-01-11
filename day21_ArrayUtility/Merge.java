package day21_ArrayUtility;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};

        int i = 0;
        int[] merged = new int[arr1.length + arr2.length];
        for (int number : arr1) {
            merged[i++] += number;

        }
        for (int number : arr2) {
            merged[i++] += number;
        }
        System.out.println(Arrays.toString(merged));
    }
}
/*arr1 = {1,2,3,4}
        arr2 = {5,6}
                output= {1,2,3,4,5,6}*/