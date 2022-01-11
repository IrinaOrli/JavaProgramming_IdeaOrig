package day18_nestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = "";
        while (true) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            if (num%2==0){
                System.out.println(num + " is even");
            }else {
                System.out.println(num + " is odd");
            }

            System.out.println("Would you like to continue?");
            a = scanner.next().toLowerCase();

            while (!(a.equals("yes")||a.equals("no"))){
                System.err.println("Invalid answer. Re-enter");
                a = scanner.next().toLowerCase();
            }

            if (a.equals("no")) {
                break;
            }

        }
    }
}
