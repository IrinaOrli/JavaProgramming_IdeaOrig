package day20_Array;

import java.util.Arrays;

public class Zeros {
    public static void main(String[] args) {


        int[] array = {10, 0, 5, 0, 1, 0};
        Arrays.sort(array);
        int j = 0;
        int[] result = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--, j++) {

            result[j] = array[i];
        }
        System.out.println(Arrays.toString(result));
    }

}

/*write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}*/