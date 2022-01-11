package day26_Practice;

import utilities.ArrayUtility;

import java.util.Arrays;

public class UniqueElements {
    
    
    public static void main(String[] args) {
        int [] array = {1,2,3,4,4,5,5};
        int [] unique = UniqueElements(array);
        System.out.println(Arrays.toString(unique));
    }
    
    // returns the unique elements from the array
    public static int [] UniqueElements (int [] array){
        int [] result = {};
        for (int each : array) {
            if (ArrayUtility.FrequencyOfElements(array,each)==1){// if the frequency is 1 - then the element is unique
               result= ArrayUtility.addElement(result,each);
            }
        }
       return result;
    }
    // returns the unique elements from the array
    public static double [] UniqueElements (double [] array){
        double [] result = {};
        for (double each : array) {
            if (ArrayUtility.FrequencyOfElements(array,each)==1){// if the frequency is 1 - then the element is unique
                result= ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }
    // returns the unique elements from the array
    public static char [] UniqueElements (char [] array){
        char [] result = {};
        for (char each : array) {
            if (ArrayUtility.FrequencyOfElements(array,each)==1){// if the frequency is 1 - then the element is unique
                result= ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }
    // returns the unique elements from the array
    public static String [] UniqueElements (String [] array){
        String [] result = {};
        for (String each : array) {
            if (ArrayUtility.FrequencyOfElements(array,each)==1){// if the frequency is 1 - then the element is unique
                result= ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }
}
