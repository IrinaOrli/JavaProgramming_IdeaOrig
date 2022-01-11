package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
                String fullName = scan.nextLine();

        System.out.println("Enter your building number:");
                String building = scan.next();

          scan.nextLine();

        System.out.println("Enter your street name:");
                String street = scan.nextLine();

        System.out.println("Enter your city name:");
                String city = scan.nextLine();

        System.out.println("Enter your state name:");
                String state = scan.next();

        System.out.println("Enter your ZIP code");
                String ZIP = scan.next();

                scan.nextLine();

        System.out.println("Enter your country name:");
                String country = scan.nextLine();

        System.out.println(fullName + "\n" + building + "\n" + street + "\n" + city+ "\n" + state + "\n"+ZIP + "\n" +country);

    }
}
