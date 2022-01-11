package day19_Loops$Array;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter operator:");
        char operator = scanner.next().charAt(0);

        if (!(operator =='+'|| operator =='-')){
            System.err.println("Invalid Math Operator:"+operator);
            System.exit(0); // terminates the whole program
        }


        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        if (operator =='-'){
            System.out.println(num1-num2);
        }
        if (operator =='+') {
            System.out.println(num1 + num2);
        }


    }
}
