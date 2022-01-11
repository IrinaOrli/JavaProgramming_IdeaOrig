package day13_StringIntro;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.nextLine();
        char first = str.charAt(0);
        char second = str.charAt(1);
        char third = str.charAt(2);
        char forth = str.charAt(3);
        char fifth = str.charAt(str.length()-1);
        String reserve = ("" + fifth + forth + third + second + first);

        if (str.length()==5) {
            System.out.println(reserve);
        }else if (str.length()<5){
            System.out.println("Too short!");
        }else
            System.out.println("Too long!");



    }
}
/*Create a class called Reverse, write a program that will reverse a
string.
Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.
*/