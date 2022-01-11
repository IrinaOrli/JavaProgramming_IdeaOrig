package day13_StringIntro;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word:");
        String firstWord = scanner.next();

        System.out.println("Enter the second word:");
        String secondWord = scanner.next();

        System.out.println("Enter the third word:");
        String thirdWord = scanner.next();

        int firstWordLenth = firstWord.length();
        int secondWordLenth = secondWord.length();
        int thirdWordLenth = thirdWord.length();

        if (firstWordLenth==secondWordLenth&& firstWordLenth==thirdWordLenth){
            System.out.println("All words are same length");
        } else if (firstWordLenth==secondWordLenth || firstWordLenth==thirdWordLenth || secondWordLenth==thirdWordLenth){
            System.out.println("Not Same nor Different lengths");
        }else
            System.out.println("All different length");


    }
}
/*Write a program  for CheckWords, the program accepts 3 words and :
- if they are same length:  print "All words are same length"
- if some same length and others not:    print "Not Same nor
Different lengths"
- if all different length :  print "All different length"
*/