package day27_WrapperClasses;

import utilities.ArrayUtility;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int [] array = insert(arr,2,100);
        System.out.println(Arrays.toString(array));
        
        
    }
    public static int [] insert (int [] array, int index, int element) {
        int[] split1 = Arrays.copyOfRange(array, 0, index);
        int[] split2 = Arrays.copyOfRange(array, index, array.length);
        int[] result = {};

        for (int each : split1) {
            result = ArrayUtility.addElement(result, each);
        }

        result = ArrayUtility.addElement(result, element);

        for (int each : split2) {
            result = ArrayUtility.addElement(result, each);
        }

        return result;

        /*
        int[] result = new int[array.length + 1];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            result[j] = array[i];
            if (i == index) {
                result[i] = element;

            }
        }
        return result; */
    }
}
/*Create a method named insert that passes three parameters: integer array, integer index, integer element. 
the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}

*/