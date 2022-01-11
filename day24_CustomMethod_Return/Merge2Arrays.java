package day24_CustomMethod_Return;

import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {
        String[] word1 = {"my", "name", "is"};
        String[] word2 = {"Irina", "Orlova"};
        String []mergedResult = mergeArrays(word1,word2);
        System.out.println(Arrays.toString(mergedResult));
    }

    public static String []mergeArrays (String[] word1, String[] word2){
        String [] merged = new String [word1.length+word2.length];
        int j=0;
        for (int i = 0; i < word1.length; i++) {
            merged[j] = word1[i];
            j++;
        }
        for (int i1 = 0; i1 < word2.length; i1++) {
        merged[j] = word2[i1];
        j++;
        }

        return merged;
    }


    //create a method that can merge two arrays and return the new array
}
