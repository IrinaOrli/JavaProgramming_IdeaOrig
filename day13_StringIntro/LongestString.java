package day13_StringIntro;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the first word or sentence:");
        String firstString = scanner.nextLine();

        System.out.println("Please enter the second word or sentence:");
        String secondString = scanner.nextLine();

        int firstStringLenth = firstString.length();
        int secondStringLenth =secondString.length();

        if (firstStringLenth > secondStringLenth) {
            System.out.println(firstString);
        }else if (firstStringLenth < secondStringLenth){
            System.out.println(secondString);
        }else
            System.out.println(firstString + ", " + secondString);

    }
}
/*write a program that asks user to enter two strings, and print out the
longest string*/