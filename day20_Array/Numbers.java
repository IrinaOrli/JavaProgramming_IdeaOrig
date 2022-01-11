package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int element=0;
        for (int i = 1; i <101 ; i++, element++) {
            numbers[element]=i;
        }
        System.out.println(Arrays.toString(numbers));
        //create an array that has the numbers 100 to 1

        System.out.println("-----------");

        Scanner scan = new Scanner(System.in);
        int allDigits[]=new int[10];
        for (int i = 0; i < 10; i++) {

            System.out.println("Enter a digit:");
            allDigits[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(allDigits));

        int max = allDigits[0];
        for (int i = 0; i < 10; i++) {
            int each = allDigits[i];
         if (each>max){
             max = each;
        }
        }
        int min = allDigits[0];
        for (int i = 0; i < allDigits.length; i++) {
            if (allDigits[i]<min){
                min=allDigits[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < allDigits.length; i++) {
            sum+=allDigits[i];
        }
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);
        }
    }


/*Write a program that asks user to enter a number 10 times:
            1. store all user entered numbers in an array
            2. find the max number
            3. find the min number*/