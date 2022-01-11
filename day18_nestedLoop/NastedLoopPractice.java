package day18_nestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class NastedLoopPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your age:");
            int age = scanner.nextInt();

            while (!(age >= 1 || age <=120)) {
                System.err.println("Invalid entry. Please re-enter age:");
                age = scanner.nextInt();
            }
            System.out.println("Would you like to continue?");
            String a = scanner.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
                System.out.println("Invalid entry. Would you like to continue?");
                a = scanner.next().toLowerCase();
            }

            if (a.equals("no")) {
                System.out.println("Thank you!");
                break;

            }
scanner.close();
        }
    }
}