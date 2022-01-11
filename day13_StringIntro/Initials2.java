package day13_StringIntro;

import java.util.Scanner;

public class Initials2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();

        char firstNameInitial = firstName.charAt(0);
        char lastNameInitial = lastName.charAt(0);

        System.out.println(firstNameInitial + "." + lastNameInitial);


    }
}
/*write a program that can return the initials of the user
ex:
cybertek
school
output:
C.S
Note: Pay attention to the example output*/