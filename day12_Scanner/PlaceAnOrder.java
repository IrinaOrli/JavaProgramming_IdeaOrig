package day12_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product name:");
        String productName = scanner.nextLine();

        System.out.println("Enter the price:");
        double price = scanner.nextDouble();

        System.out.println("Enter the quantity:");
        int quantity = scanner.nextInt();

        System.out.println("Enter your first name:");
        String firstName = scanner.next();

        double priceTotal = price*quantity;

        System.out.println(firstName + ", your order for " + quantity + " " + productName + " has been places. " +
                "Your total is $" + priceTotal);

    }
}
/*PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
*/