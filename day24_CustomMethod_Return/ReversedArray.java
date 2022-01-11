package day24_CustomMethod_Return;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
    int [] numbers = {9,8,7,6,5,4,3,2,1};
    int [] reversedArray = reveredArray(numbers);
        System.out.println(Arrays.toString(reversedArray));


    }

public static int [] reveredArray (int [] numbers){
   // int [] reversed =
    for (int i = 0, j=numbers.length-1; i < numbers.length/2; i++, j--) {

        int temp = numbers[i];
        numbers[i]=numbers[j];
        numbers [j] = temp;
    }
return numbers;
}
    //  create a method that return the reversed array
}
