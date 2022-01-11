package day20_Array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[]alphabet= new char [26];
       //                                                                char character ='Z';
        //alphabet[0] = 'Z';//90
        char ch ='Z';
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i]=ch--;
        }

        System.out.println(Arrays.toString(alphabet));//entire array
        System.out.println(alphabet[0]);//the element og array

        System.out.println("==============");
        for (char i = 0, j ='Z';i < alphabet.length ; i++, j--) {
            alphabet[i]=j;

        }
        System.out.println(Arrays.toString(alphabet));//entire array
    }
}
