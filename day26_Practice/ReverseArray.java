package day26_Practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int []result = reverseArray(array);
        System.out.println(Arrays.toString(result));
    }

    // reverses the array, returns a new array
    public static  int []reverseArray(int []array){

        int [] result = new int [array.length];
        for (int i = array.length-1, j=0 ; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }
    public static  double []reverseArray(double []array){

        double [] result = new double [array.length];
        for (int i = array.length-1, j=0 ; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }
    public static  char []reverseArray(char []array){

        char [] result = new char [array.length];
        for (int i = array.length-1, j=0 ; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }
    public static  String []reverseArray(String []array){

        String [] result = new String [array.length];
        for (int i = array.length-1, j=0 ; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }
}
