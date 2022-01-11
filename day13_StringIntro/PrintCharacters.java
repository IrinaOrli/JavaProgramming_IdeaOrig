package day13_StringIntro;

import java.util.Scanner;

public class PrintCharacters {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.nextLine();


        if (str.isEmpty()){
            System.out.println("String is empty");
        }else if (str.length()>3){
            System.out.println(str.substring(str.length()-3));
        }else
            System.out.println(str);





    }
}
/*Write a method that asks user to enter a string.
if the string is empty, print: string is empty
if the string has more than 3 characters, print the last three
characters
if the string has less than or equal 3 characters, print the
string itself
*/