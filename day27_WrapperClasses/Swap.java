package day27_WrapperClasses;

import utilities.ArrayUtility;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int[] result = swap(arr, 2, 4);
        System.out.println(Arrays.toString(result));
    }

    public static int[] swap(int[] array, int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;

      /* int swapped[] = {};
        for (int i1 = 0; i1 < array.length; i1++) {
            ArrayUtility.addElement(swapped, array[i1]);
            if (i1 == i){
                swapped[i1]  = array[j];
            }




        }
        return swapped;*/
    }

}

/*Create a method named swap that passes three parameters: integer array, integer i, integer j.
the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}*/