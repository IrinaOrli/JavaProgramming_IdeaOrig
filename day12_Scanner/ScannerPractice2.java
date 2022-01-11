package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//123Enter
        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        System.out.println("Enter your Programming Language:");
        String proglang = input.nextLine();// Java Programming LanguageEnter

        System.out.println("Enter your age:");
        int age = input.nextInt(); //24

        System.out.println("name = " + name);
        System.out.println("proglang = " + proglang);


        input.close();
    }
}
