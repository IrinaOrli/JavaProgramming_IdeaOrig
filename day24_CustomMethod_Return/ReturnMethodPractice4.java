package day24_CustomMethod_Return;

import Day14_String.SratsA;

import java.io.StringReader;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
        String str = "sdgsgghhhcxxxdi";
        String removed= removeDuplicates(str);
        System.out.println(removed);

    }

    //create a method that can remove duplicated characters from a string and returns the new value
    public static String removeDuplicates(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(result.contains(str.charAt(i) + ""))) {
                result += str.charAt(i);

            }
        }
        return result;
    }
}

