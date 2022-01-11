package day20_Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

       char[] letters = new char[26];

        //letters [0] ='A';

        for (char i = 'A', j=0; i <= 'Z'&&j< letters.length; i++,j++) {
            letters [j]=i;
        }
        //A-Z
        char ch ='A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch;
            ch++;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("============================");
        char[] letters2=new char[26];

        char character = 'Z';

        for (int i = 0; i < letters2.length; i++) {
            letters2[i]=character;
            character--;

        }
        System.out.println(Arrays.toString(letters2));


        }

    }

