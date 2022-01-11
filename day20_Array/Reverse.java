package day20_Array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int []array = {1,2,3,4,5};
        int [] reversedArray =new int [array.length];
        int j =0;
        for (int i =array.length -1; i >= 0; i--,j++) {

            int eachReverse = reversedArray[j];
            reversedArray[j] =array[i];
        }
        System.out.println(Arrays.toString(reversedArray));



    }
}
/*Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};
216 chambwood
10-12
washer sams not spinning
7046545499

Diane


        output:
            reversedArray = {5,4,3,2,1};*/