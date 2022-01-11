package Day14_String;

import java.util.Locale;
import java.util.Scanner;

public class FullNameInRegular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your name");
        String lastName = scanner.nextLine();

        String firstNameInRegular = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        String lastNameInRegular = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(firstNameInRegular);
        System.out.println(lastNameInRegular);
        System.out.printf(firstNameInRegular + " "+lastNameInRegular);
        scanner.close();
    }
}
/*Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School*/