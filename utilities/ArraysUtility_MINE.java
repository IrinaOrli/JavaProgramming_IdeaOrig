package utilities;

import java.util.Arrays;

public class ArraysUtility_MINE {

    // prints each integer of an integer array in separate lines
    public static void printEachElement (int [] array){
        for (int each : array) {
            System.out.println(each);
        }
    }
    
    // prints each double of a double array in separate lines
    public static void printEachElement (double [] array){
        for (double each : array) {
            System.out.println(each);
        }
    }
    
    // prints each char of a char array in separate lines
    public static void printEachElement (char [] array){
        for (char each : array) {
            System.out.println(each);
        }
    }
    
    // prints each String of a String array in separate lines
    public static void printEachElement (String [] array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    // returns the maximum number from the integer array
        public static int maxNumber (int [] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

    // returns the maximum number from the integer array
    public static double maxNumber (double [] array){
        Arrays.sort(array);
        return array[array.length-1];
}

    // checks if the given integer in the given array. returns boolean (contains int [],int)
    public static boolean containsElement (int [] array, int element){
        boolean result = false;

        for (int each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }

    public static boolean containsElement (double [] array, double element){
        boolean result = false;

        for (double each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }

    public static boolean containsElement (char [] array, char element){
        boolean result = false;

        for (char each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }

    public static boolean containsElement (String [] array, String element){
        boolean result = false;

        for (String each : array) {
            if (each.equals(element)){
                result=true;
            }
        }
        return result;
    }
}