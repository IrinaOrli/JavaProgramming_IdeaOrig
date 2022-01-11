package day26_Practice;

import utilities.ArrayUtility;

import java.util.Arrays;

public class Merge2Arr {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6,7};
       int [] arr3 = merge2Arrays(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
    }

    public static int [] merge2Arrays (int [] arr1, int [] arr2){
        int [] result = {};

          for (int each : arr1) {
            result = ArrayUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArrayUtility.addElement(result, each);
        }
        return result;
    }
    public static double [] merge2Arrays (double [] arr1, double [] arr2){
        double [] result = {};

        for (double each : arr1) {
            result = ArrayUtility.addElement(result, each);
        }
        for (double each : arr2) {
            result = ArrayUtility.addElement(result, each);
        }
        return result;
    }
    public static char [] merge2Arrays (char [] arr1, char [] arr2){
        char [] result = {};

        for (char each : arr1) {
            result = ArrayUtility.addElement(result, each);
        }
        for (char each : arr2) {
            result = ArrayUtility.addElement(result, each);
        }
        return result;
    }
    public static String [] merge2Arrays (String [] arr1, String [] arr2){
        String [] result = {};

        for (String each : arr1) {
            result = ArrayUtility.addElement(result, each);
        }
        for (String each : arr2) {
            result = ArrayUtility.addElement(result, each);
        }
        return result;
    }

    }

