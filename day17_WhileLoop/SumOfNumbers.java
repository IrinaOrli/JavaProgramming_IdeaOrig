package day17_WhileLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int sum = num;
        while (num > 0) {
            System.out.println("Enter a number");
            num = scanner.nextInt();
            sum = sum + num;

            if (num < 0) {
                break;

            }
            System.out.println("Sum of numbers entered = " + sum);


        }
    }

}
/*Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop*/