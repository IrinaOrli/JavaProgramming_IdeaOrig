package day13_StringIntro;

import java.util.Scanner;

public class First$LastCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();

        char firstLetter = sentence.charAt(0);
        char lastLetter = sentence.charAt(sentence.length()-1);

        System.out.println("firstLetter = " + firstLetter);
        System.out.println("lastLetter = " + lastLetter);

    }
}
/*write a program that asks user to enter a sentence.
then print the first & last characters of the sentence*/