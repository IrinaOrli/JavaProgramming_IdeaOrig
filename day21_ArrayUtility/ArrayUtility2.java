package day21_ArrayUtility;

import java.util.Arrays;

public class ArrayUtility2 {
    public static void main(String[] args) {


        String[] students = {"A", "B","C","D", "E"};
        String [] earlyBird = Arrays.copyOf(students,3);

        System.out.println(Arrays.toString(earlyBird));

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers,5);

        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------");

        char[] ch1 = {'A', 'B','C','D','E','F','G'};
        char [] ch2 = Arrays.copyOfRange(ch1,2,6);

        System.out.println(Arrays.toString(ch2));

        int [] scores = {10,20,30,40,50,60,70,80,90,100};
        int [] result = Arrays.copyOfRange(scores, 3,7+1);

        System.out.println(Arrays.toString(result));

        int [] result1 = Arrays.copyOfRange(scores,7, scores.length);
        System.out.println(Arrays.toString(result1));


    }
}
