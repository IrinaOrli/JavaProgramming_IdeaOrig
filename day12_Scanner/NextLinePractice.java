package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();//Enter clear

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA:");
        double GPA = input.nextDouble();

        input.nextLine(); //Clear Enter of previous method before .nextLine()

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();


        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("GPA = " + GPA);
        System.out.println("schoolName = " + schoolName);


    }
}
