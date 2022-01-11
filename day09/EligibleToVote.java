package day09;

public class EligibleToVote {
    public static void main(String[] args) {
       //Write a program that can check if the person is eligible to vote

        int age = 21;
        String citizenship = "Russia";

        if (age >=21 && citizenship == "USA"){
            System.out.println("Person is eligible to vote.");
        }
        else {
            System.out.println("Person is not eligible to vote.");
        }

    }
}
