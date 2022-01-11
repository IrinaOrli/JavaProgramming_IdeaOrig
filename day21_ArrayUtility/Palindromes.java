package day21_ArrayUtility;

import java.util.Arrays;

public class Palindromes {
    public static void main(String[] args) {

        int count = 0;
        int j = 0;
        String palindromes = "";
        String[] names = {"anna", "level", "Java"};
        String [] reverse = new String[names.length];


        for (String name : names) {
            String reversedname = "";
            for (int i = name.length() - 1; i >= 0; i--) {
                reversedname += name.charAt(i);

            }
            reverse[j]=reversedname;
            j++;
        }

        for (int i = 0, i1=0; i < names.length-1; i++,i1++) {
            if (names[i].equalsIgnoreCase(reverse[i1])){
                palindromes+= names[i]+ " ";
                count++;
            }

        }
        System.out.println(palindromes);
        System.out.println(count);

    }
}



/*write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2*/