package day18_nestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your first number");
            int num1 = scanner.nextInt();

            System.out.println("Enter your second number");
            int num2 = scanner.nextInt();

            System.out.println("Addition: " + (num1 + num2));
            System.out.println("Would you like to continue?");
            String a = scanner.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid entry, please reenter");
                a = scanner.next().toLowerCase();
            }
            if (a.equals("no")) {
                break;
            }
scanner.close();
        }
    }
}

