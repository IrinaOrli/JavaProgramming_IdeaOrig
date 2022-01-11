package day17_WhileLoop;

import java.util.Locale;
import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String reply = "";
        String result = "";
        String roomType = "";
        int roomRate = 0;


        System.out.println("Would you like to reserve a room?");
        reply = scanner.next();
        while (!(reply.equalsIgnoreCase("yes") || reply.equalsIgnoreCase("no"))) {
            System.err.println("Invalid entry. Please re-enter");
            reply = scanner.next();
        }
        scanner.nextLine();

        if (reply.equalsIgnoreCase("no")) {
            System.out.println("Have a nice day!");

        } else {
            System.out.println("Which type of room do you want to reserve?");
            roomType = scanner.nextLine();

            while (!(roomType.equalsIgnoreCase("King Bed") || roomType.equalsIgnoreCase("Queen Bed") || roomType.equalsIgnoreCase("Single Bed"))) {
                System.err.println("Invalid entry. Please re-enter room type");
                roomType = scanner.nextLine();
            }
                if (roomType.equalsIgnoreCase("King Bed")) {
                    roomRate = 120;
                } else if (roomType.equalsIgnoreCase("Queen Bed")) {
                    roomRate = 100;
                } else {
                    roomRate = 80;
                }

            }
        System.out.println("You have reserved a " + roomType + " room. Total price for your reservation is : $" + roomRate);
        }

    }





/*Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)*/