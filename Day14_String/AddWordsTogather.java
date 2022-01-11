package Day14_String;

import java.util.Scanner;

public class AddWordsTogather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word:");
        String firstWord = scanner.next();

        System.out.println("Enter the second word:");
        String secondWord = scanner.next();

        char last = firstWord.charAt(firstWord.length()-1);
        char first = secondWord.charAt(0);

        String combine = "";

        if (last==first) {
            // firstWord = firstWord.substring(0,firstWord.charAt(firstWord.length()-1));  ???????????
            secondWord = secondWord.substring(1);

            combine = firstWord+secondWord;
        }
        System.out.println(combine);

    }

}

