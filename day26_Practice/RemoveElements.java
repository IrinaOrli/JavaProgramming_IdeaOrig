package day26_Practice;

import utilities.ArrayUtility;

import java.util.Arrays;

public class RemoveElements {

    public static void main(String[] args) {
        int [] numbers = {100,200,300,400,500,600};
        numbers = RemoveElements(numbers,1);
        System.out.println(Arrays.toString(numbers));
    }

    //removes the index element from the array, returns new array
    public static int [] RemoveElements (int [] array, int index){
        if (index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }

        int [] result = new int [array.length-1];
        int j=0;
        for (int i=0; i< array.length; i++) {
            if (i==index){
                continue;
            }
            result[j++]=array[i];

        }
       return result;
    }

    public static double [] RemoveElements (double [] array, int index){
        if (index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }

        double [] result = new double [array.length-1];
        int j=0;
        for (int i=0; i< array.length; i++) {
            if (i==index){
                continue;
            }
            result[j++]=array[i];

        }
        return result;
    }
    public static char [] RemoveElements (char [] array, int index){
        if (index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }

        char [] result = new char [array.length-1];
        int j=0;
        for (int i=0; i< array.length; i++) {
            if (i==index){
                continue;
            }
            result[j++]=array[i];

        }
        return result;
    }
    public static String [] RemoveElements (String [] array, int index){
        if (index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }

        String [] result = new String [array.length-1];
        int j=0;
        for (int i=0; i< array.length; i++) {
            if (i==index){
                continue;
            }
            result[j++]=array[i];

        }
        return result;
    }

/*
    public static int [] RemoveElements (int [] array, int index){
        int []result = {};
        for (int i = 0; i < array.length; i++) {
            if (i!=index){
                result = ArrayUtility.addElement(result,array[i]);
            }
        }
        return result;*/
}
