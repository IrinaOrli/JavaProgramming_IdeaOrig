package Day14_String;

import java.util.Scanner;

public class EmailTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email address:");
        String email = scanner.nextLine();

        String newEmail =  "";

        if (email.contains("_")) {
            int indexOf_ = email.indexOf("_");
            int indexOfAt = email.indexOf("@");
            String firstName = email.substring(0,indexOf_);
            String lastName = email.substring(indexOf_+1, indexOfAt);
            String domain = email.substring(indexOfAt);
            newEmail = lastName + "_" + firstName + domain;

        } else
            newEmail = email;
        System.out.println(newEmail);
    }
}
/*Create a class calledEmailTask1.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that can swap first name with last name in the
email (Seperated by an underscore).
If the email doesn't contain an underscore print the given input
email.
Ex:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
*/