package day21_MultiDimansionalArray;

import java.util.Arrays;

public class ReverseSecond {
    public static void main(String[] args) {

        String sentence = "I Love Java";
        String [] splitted = sentence.split(" ");
        String reversed = "";

        for (int i = splitted[1].length()-1; i >=0 ; i--) {
            reversed +=   splitted[1].charAt(i);
        }
        System.out.println(reversed);

        //sentence = sentence.replaceFirst(splitted[1], reversed);
        //System.out.println(sentence);
        splitted[1] = reversed;

       // System.out.println(Arrays.toString(splitted));
        for (String word : splitted) {
            System.out.print(word+ " ");
        }

        }

    }

/* Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java*/