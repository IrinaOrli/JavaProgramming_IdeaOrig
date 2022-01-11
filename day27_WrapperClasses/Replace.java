package day27_WrapperClasses;

public class Replace {
    public static int [] replace (int [] array, int index, int newElement){
        if (index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }
    public static double [] replace (double [] array, int index, double newElement){
        if (index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }
    public static char [] replace (char [] array, int index, char newElement){
        if (index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }
    public static String [] replace (String [] array, int index, String newElement){
        if (index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }




}
/*Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the
array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


*/