package day13_StringIntro;

import java.util.Scanner;

public class SameCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word or sentence:");
        String sentence = scanner.nextLine();

       char firstCharacter = sentence.charAt(0);
       char lastCharacter = sentence.charAt(sentence.length()-1);

       if (firstCharacter==lastCharacter){
           System.out.println("same");
       }else
           System.out.println("not the same");


    }
}
/*write a program that can check if the first and last characters of the
string are same
ex:
level
output:
same*/