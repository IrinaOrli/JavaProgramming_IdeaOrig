package day21_ArrayUtility;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbac";

        char [] eachCharacter1 = str1.toCharArray();
        char [] eachCharacter2 = str2.toCharArray();

        Arrays.sort(eachCharacter1);
        //System.out.println(Arrays.toString(eachCharacter1));
        Arrays.sort(eachCharacter2);

      boolean IsAnagram = (Arrays.equals(eachCharacter1,eachCharacter2));

        System.out.println(IsAnagram);


        }


    }

