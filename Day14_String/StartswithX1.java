package Day14_String;

import java.util.Scanner;

public class StartswithX1 {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next();
        if (word.charAt(0)=='x'){
            String modifiedWord = word.replaceFirst("x","a");
            System.out.print(modifiedWord);
        }else
            System.out.print(word);

    }
}
/*Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex*/