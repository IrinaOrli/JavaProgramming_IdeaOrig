package Day14_String;

import java.util.Scanner;

public class SratsA {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a word:");
            String word = scanner.next();

            char firstChar = word.charAt(0);

            if (firstChar == 'x') {
                String newWord = word.replaceFirst("x", "a");
                System.out.println(newWord);
            }


        }
    }


/*Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex*/