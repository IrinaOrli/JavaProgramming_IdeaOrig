package Day14_String;

import java.util.Scanner;

public class ReplacaAllX {
    public static void main(String[] args) {
        String word = new Scanner(System.in).nextLine();
        /*if (word.charAt(0) == 'x' || word.charAt(0) == 'X') {
            String ModifiedWord = "";
            ModifiedWord = word.replace("x", "a");
            ModifiedWord = ModifiedWord.replace("X", "a");
            System.out.printf(ModifiedWord);*/
            String result = word.replace("x", "a").replace("X", "a");
            //  "acodeX"                                 "acodea"



        System.out.println(result);
        }
    }

/*Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea*/