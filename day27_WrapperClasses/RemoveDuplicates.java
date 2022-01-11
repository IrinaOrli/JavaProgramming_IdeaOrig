package day27_WrapperClasses;

import day20_Array.ArraysUtility;
import utilities.ArrayUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int [] removeDuplicates (int [] array){

        int [] result = {};
        for (int each : array) {
            if (!(ArrayUtility.contains(result,each))){
                result = ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }
    public static double [] removeDuplicates (double [] array){

        double [] result = {};
        for (double each : array) {
            if (!(ArrayUtility.contains(result,each))){
                result = ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }
    public static char [] removeDuplicates (char [] array){

        char [] result = {};
        for (char each : array) {
            if (!(ArrayUtility.contains(result,each))){
                result = ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }
    public static String [] removeDuplicates (String [] array){

        String [] result = {};
        for (String each : array) {
            if (!(ArrayUtility.contains(result,each))){
                result = ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }
}
