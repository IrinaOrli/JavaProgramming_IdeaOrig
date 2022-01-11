package day26_Practice;

import utilities.ArrayUtility;

import java.util.Arrays;

public class Merge_WRONG {

        public static void main(String[] args) {
            int [] arr1 = {1,2,3,4};
            int [] arr2 = {5,6,7};
            int [] arr3 = merge2Arrays(arr1,arr2);
            System.out.println(Arrays.toString(arr3));
        }

    public static int [] merge2Arrays (int[] array1, int [] array2){
        int [] result = {};
        for (int each1 : array1) {
            result = ArrayUtility.addElement(array1, each1);
        }
        for (int each2 : array2) {
            result = ArrayUtility.addElement(array2, each2);
        }
        return result;
        }

    }


