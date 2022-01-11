package day21_ArrayUtility;

import java.util.Arrays;

public class StringMethods_toCharArray {
    public static void main(String[] args) {

        String str = "Java";
char [] character = str.toCharArray();


        System.out.println(Arrays.toString(character));

        for (char each : str.toCharArray()) {
            System.out.println(each);



        }
    }
}
