package Day14_String;

import java.util.Locale;
import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email address:");
        String email = scanner.nextLine();

            int indexOf_ = email.indexOf("_");
            int indexOfAt = email.indexOf("@");
            int indexPfDot = email.lastIndexOf(".");
            String firstName = email.substring(0, indexOf_);
            String lastName = email.substring(indexOf_ + 1, indexOfAt);
            String domain = email.substring(indexOfAt+1, indexPfDot);

            /*String firstLetterInFirstName = firstName.substring(0,1);
            String firstLetterInLastName = lastName.substring(0,1);

            String firstLetterInFirstName1 = firstLetterInFirstName.toUpperCase();
            String firstLetterInLastName2 = firstLetterInLastName.toUpperCase();

            firstName = firstLetterInFirstName1 + firstName.substring(1);
            lastName = firstLetterInLastName2 + lastName.substring(1);*/


                System.out.println("First name: " + firstName.substring(0,1).toUpperCase() + firstName.substring(1));
                System.out.println("Last name: " + lastName.substring(0,1).toUpperCase() + lastName.substring(1));
                System.out.println("Domain: " +domain);
    }
}
/*Create a class called EmailTask2.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that will print out information about user based on
email. Print first name, last name, and domain.
First and Last name should be printed with proper format -
uppercase first letter and remaining lowercase.
Ex:
input:
craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple*/