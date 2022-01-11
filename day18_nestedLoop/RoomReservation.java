package day18_nestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = 0;


        while (true) {

            System.out.println("Which bedroom do you want to reserve?");
            String answer = scanner.nextLine();
            while (!(answer.equalsIgnoreCase("King Bed") || answer.equalsIgnoreCase("Queen Bed") || answer.equalsIgnoreCase("Single Bed"))) {
                System.err.println("Invalid input.Which bedroom do you want to reserve?");
                answer = scanner.nextLine();
            }
            if (answer.equalsIgnoreCase("King Bed")) {
                price += 120;
            }
            if (answer.equalsIgnoreCase("Queen Bed")) {
                price += 100;
            }
            if (answer.equalsIgnoreCase("Single Bed")) {
                price += 80;
            }

            System.out.println("Would you like to reserve another room?");
            String answer2 = scanner.nextLine();
            while (!(answer2.equalsIgnoreCase("yes") || answer2.equalsIgnoreCase("no"))) {
                System.err.println("Invalid input. Would you like to reserve another room?");
                answer2 = scanner.next();
            }


            if (answer2.equalsIgnoreCase("no")) {
                System.out.println("Your total is $" + price);
                break;
            }


        }
    }
}




    /*Create a class called RoomReservation, write a program for the room reservation:
        King Bed ==> 120$
        Queen Bed ==> 100$
        single Bed ==> 80$

        the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
        Then Ask the user "would you like to reserve another room?""
        if yes ==> repeat the entire steps
        if no ==> return the  total price

        If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry*/
