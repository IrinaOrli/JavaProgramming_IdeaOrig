package day18_nestedLoop;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int result = 0;

        while (true) {
            System.out.println("Enter the first number");
            int num1 = scanner.nextInt();

            System.out.println("Enter a math operator");
            char operator = scanner.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.out.println("Invalid input. Re-enter a math operator");
                operator = scanner.next().charAt(0);
            }

            System.out.println("Enter the second number");
            int num2 = scanner.nextInt();

            if (operator == '+') {
                result = num1 + num2;
            }
            if (operator == '-') {
                result = num1 - num2;
            }
            if (operator == '*') {
                result = num1 * num2;
            }
            if (operator == '/') {
                result = num1 / num2;
            }
            System.out.println(result);
            System.out.println("Do you want to continue? ");
            String answer = scanner.next();
            while (!(answer.equals("yes"))) {
                System.err.println("Invalid input. Do you want to continue? ");
                answer = scanner.next();
            }
            if (answer.equals("no")) {
                System.out.println("Thanks for using Cydeo calculator!");
            }
        }

    }
}
/*Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
*/