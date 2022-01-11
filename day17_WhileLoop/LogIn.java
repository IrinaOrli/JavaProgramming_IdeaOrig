package day17_WhileLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        //username "Cydeo"
        //password "Cydeo123"

        Scanner scan = new Scanner(System.in);

// while (invalid&&hasAttempts)

        System.out.println("Enter your username");
        String username = scan.next();

        System.out.println("Enter your password");
        String password = scan.next();

             int attempt = 3;

            while (!(username.equals("Cydeo")  && password.equals ("Cydeo123"))&&attempt>0) {
                System.err.println("Invalid. Re-enter");
                System.out.println("Enter your username and password");
                username = scan.next();
                password = scan.next();
                attempt--;
            }
                if (username.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("Logged-in");
                 }else{
                    System.out.println("Your account is locked");
                }
        scan.close();
        }

    }
