package day17_WhileLoop;

import java.util.Scanner;

public class LogIn2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = scan.next();

        System.out.println("Enter your password");
        String password = scan.next();

        if (username.equals("Cydeo")&& password.equals("WoodenSpoon")){

            System.out.println("Logged In");
        }else {
            for (int i = 1; i < 4; i++) {
                System.err.println("Incorrect username or password");
                System.out.println("Enter your username:");
                username = scan.next();
                System.out.println("Enter your password");
                password = scan.next();
            }
                if (!(username.equals("Cydeo") && password.equals("WoodenSpoon"))) {
                    System.err.println("Account blocked");

                }
            }

scan.close();
        }


    }
