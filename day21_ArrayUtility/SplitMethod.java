package day21_ArrayUtility;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {

        String sentence = "Wooden Spoon";
       String [] words= sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("----------------");


        String email = "WoodenSpoon@cydeo.com";
        String [] splitted = email.split("@");

        System.out.println(Arrays.toString(splitted));

        System.out.println("------------------");

        String sentences = "Today is a nice day. Today is Monday. Today we learn Java";

       String[] splitSentence= sentences.split("\\.");
        System.out.println(Arrays.toString(splitSentence));



    }
}
