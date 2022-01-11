package day17_WhileLoop;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in)     ;
        System.out.println("Enter age");
        int age = scan.nextInt();

        while (!(age >=1 && age<=120)){
            System.err.println("invalid.Re-enter");
            System.err.println("Enter age");
            age = scan.nextInt();
        }
        System.out.println("Are you a US citizen?");
        String answer = scan.next().toLowerCase();

        while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))) {
            System.err.println("invalid.Re-enter");
            System.err.println("Are you a US citizen?");
            answer = scan.next().toLowerCase();
        }
        if (age>=18&&answer.equals("yes")){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
scan.close();
    }
}
