package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 101 ; i++) {
            sum +=i;

        }
        System.out.print(sum);

        System.out.println("-------------");



        int total=0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter a number:");
            int number = new Scanner(System.in).nextInt();
            total+=number;
        }
        System.out.println(total);




    }
}
