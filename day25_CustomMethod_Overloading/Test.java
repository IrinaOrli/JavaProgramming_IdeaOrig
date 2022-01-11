package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

       String str = "Java programming Language";
        StringUtility.printEachChar(str);

        String word = "Civic";
        System.out.println(StringUtility.isPalindrome(word));

    String str2 = "aasssddddsdfgdds";
        str2 =StringUtility.removeDuplicates(str2);
        System.out.println(str2);
        }


    }



