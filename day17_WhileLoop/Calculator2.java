package day17_WhileLoop;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        int result = 0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println("Enter math operator");
        char operator = scanner.next().charAt(0);

        while (!(operator == '+'||operator == '-'|operator == '*'|operator == '/')){
            System.err.println("Invalid input! Enter math operator");
            operator = scanner.next().charAt(0);
        }
        if (operator== '+'){
            result = n1+n2;
        }else if (operator== '-'){
            result = n1-n2;
        }else if (operator== '*'){
                result = n1*n2;
        } else {
            result = n1/n2;
        }

        System.out.println("result = " + result);;


    }


}
/*write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)*/