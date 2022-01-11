package day20_Array;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //store ten elements:10.20.50.70
        int [] numbers = {10,20,50,70};//size: 4

        System.out.println(Arrays.toString(numbers));


        System.out.println("------------");
        // 5 scores
        int scores [] = new int[5];
        scores [1] = 85;
        scores[scores.length-1] = 95;
        scores[3] = 75;
        scores[0]=65;
        scores [2] = 55;

        System.out.println(Arrays.toString(scores));

        System.out.println("--------------");

String [ ]month = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
/*
        System.out.println(month[0]);
        System.out.println(month[1]);
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[11]);*/

        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]);
        }

        System.out.println("--------------");

        for (int i = month.length-1; i >=0 ; i--) {

            System.out.println(month[i]);


        }
    }
}
