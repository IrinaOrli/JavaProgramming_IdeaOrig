package day19_Loops$Array;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
            System.out.println("Would you like to enter another number?(yes/no)");
            String a = scanner.next();

            if (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            if (a.equalsIgnoreCase("no")) {
                System.out.println("Thank you!");
                break;

            }


        }


    }
}
