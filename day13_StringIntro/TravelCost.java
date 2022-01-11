package day13_StringIntro;

import java.util.Scanner;

public class TravelCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a valid passport (yes or no)?");
        String HasPassport = scanner.next();

        scanner.nextLine();

        if (HasPassport.equalsIgnoreCase("yes")) {

            int baseTicketCost = 1000;

            System.out.println("What country are you traveling to?");
            String CountryName = scanner.nextLine();

            System.out.println("How many bags will you take?");
            byte bagsQuantity = scanner.nextByte();
            int extraForBags = 50 * bagsQuantity;

            System.out.println("How many people are you traveling with?");
            short peopleQuantity = scanner.nextShort();


            int totalCost = 0;
            if (peopleQuantity >= 0) {
                if (peopleQuantity == 0) {
                    totalCost = baseTicketCost + extraForBags;
                } else if (peopleQuantity == 1) {
                    totalCost = baseTicketCost + extraForBags - 100;
                } else if (peopleQuantity == 2) {
                    totalCost = baseTicketCost + extraForBags - 200;
                } else
                    totalCost = baseTicketCost + extraForBags - 300;
            } else
                System.out.println("Invalid number of people");

            scanner.nextLine();

            System.out.println("Enter the names of the people you are traveling with in one line, separating each name with a comma:");
            String PeoplesName = scanner.nextLine();

            System.out.println("Your ticket is booked to " + CountryName + ". We have charged extra for the " + bagsQuantity +
                    " bags, but you are traveling with " + peopleQuantity + " people, so we are giving a discount. Your total cost is $"
                    + totalCost);
        } else if (HasPassport.equalsIgnoreCase("no")) {

            int basePassportCost = 200;
            System.out.println("What year did your passport expire?");
            int expirationYear = scanner.nextInt();
            int yearsOfExpiration = 2021 - expirationYear;
            int extraForExpiration = 75 * yearsOfExpiration;

            scanner.nextLine();

            System.out.println("Which country do they plan to travel to?");
            String countryPlanToTravel = scanner.nextLine();

            System.out.println("Will you be traveling in the next year (yes or no)?");
            String IsTravelingNextYear = scanner.next();

            int costAmount = 0;
            if (IsTravelingNextYear.equalsIgnoreCase("yes")) {
                costAmount = basePassportCost + extraForExpiration + 100;
            } else if (IsTravelingNextYear.equalsIgnoreCase("no")) {
                costAmount = basePassportCost + extraForExpiration - 50;
            }
            System.out.println("Looks like your password has been expired for " + yearsOfExpiration +
                    " years, but not to worry we will get it ready for you to travel to " + countryPlanToTravel +
                    ". Your total cost has come out to $" + costAmount + ".");


        }
    }
}
