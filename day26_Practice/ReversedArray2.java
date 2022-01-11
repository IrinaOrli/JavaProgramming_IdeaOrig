package day26_Practice;

import utilities.ArrayUtility;

public class ReversedArray2 {

    public static int [] reverseArray(int []array){
        int [] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
           result= ArrayUtility.addElement(result, array[i]);
        }
        return result;
        }

    }

