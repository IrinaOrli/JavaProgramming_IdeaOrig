package utilities;
import java.util.Arrays;

public class ArrayUtility {
    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    //prints each double of double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    //prints each char of char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    //prints each String of String array in separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    //returns the maximum number from integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    //returns the maximum number from double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    //returns the minimum number from integer array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //returns the minimum number from double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //checks if the given integer is contained in the given array. returns boolean.  contains(int[], int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) { // if any array's element is matching with the given element, it means the given elements is contained in the array
                result = true;
            }
        }
        return result;
    }

    //checks if the given double is contained in the given array. returns boolean.
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the given char is contained in the given array. returns boolean.
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }


    //checks if the given String is contained in the given array. returns boolean.
    public static boolean contains(String[] array, String element) {

        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }

    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    // adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // returns the frequency of the given element from the given array
    public static int FrequencyOfElements(int[] array, int number) {

        int count = 0;
        for (int each : array) {
            if (each == number) {
                count++;
            }
        }
        return count;
    }

    public static int FrequencyOfElements(double[] array, double number) {

        int count = 0;
        for (double each : array) {
            if (each == number) {
                count++;
            }
        }
        return count;
    }

    public static int FrequencyOfElements(char[] array, char element) {

        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    public static int FrequencyOfElements(String[] array, String element) {

        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }


    // returns the unique elements from the array
    public static int[] UniqueElements(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (ArrayUtility.FrequencyOfElements(array, each) == 1) {// if the frequency is 1 - then the element is unique
                result = ArrayUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static double[] UniqueElements(double[] array) {
        double[] result = {};
        for (double each : array) {
            if (ArrayUtility.FrequencyOfElements(array, each) == 1) {// if the frequency is 1 - then the element is unique
                result = ArrayUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static char[] UniqueElements(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (ArrayUtility.FrequencyOfElements(array, each) == 1) {// if the frequency is 1 - then the element is unique
                result = ArrayUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static String[] UniqueElements(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (ArrayUtility.FrequencyOfElements(array, each) == 1) {// if the frequency is 1 - then the element is unique
                result = ArrayUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the index element from the array, returns new array
    public static int [] RemoveElements (int [] array, int index){
        if (index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }

        int [] result = new int [array.length-1];
        int j=0;
        for (int i=0; i< array.length; i++) {
            if (i==index){
                continue;
            }
            result[j++]=array[i];

        }
        return result;
    }

    public static double [] RemoveElements (double [] array, int index){
        if (index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }

        double [] result = new double [array.length-1];
        int j=0;
        for (int i=0; i< array.length; i++) {
            if (i==index){
                continue;
            }
            result[j++]=array[i];

        }
        return result;
    }

    public static char [] RemoveElements (char [] array, int index){
        if (index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }

        char [] result = new char [array.length-1];
        int j=0;
        for (int i=0; i< array.length; i++) {
            if (i==index){
                continue;
            }
            result[j++]=array[i];

        }
        return result;
    }

    public static String [] RemoveElements (String [] array, int index){
        if (index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }

        String [] result = new String [array.length-1];
        int j=0;
        for (int i=0; i< array.length; i++) {
            if (i==index){
                continue;
            }
            result[j++]=array[i];

        }
        return result;
    }

    // merges 2 arrays, returns a new array
    public static int [] merge2Arrays (int [] arr1, int [] arr2){
        int [] result = {};

        for (int each : arr1) {
            result = ArrayUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArrayUtility.addElement(result, each);
        }
        return result;
    }

    public static double [] merge2Arrays (double [] arr1, double [] arr2){
        double [] result = {};

        for (double each : arr1) {
            result = ArrayUtility.addElement(result, each);
        }
        for (double each : arr2) {
            result = ArrayUtility.addElement(result, each);
        }
        return result;
    }

    public static char [] merge2Arrays (char [] arr1, char [] arr2){
        char [] result = {};

        for (char each : arr1) {
            result = ArrayUtility.addElement(result, each);
        }
        for (char each : arr2) {
            result = ArrayUtility.addElement(result, each);
        }
        return result;
    }

    public static String [] merge2Arrays (String [] arr1, String [] arr2){
        String [] result = {};

        for (String each : arr1) {
            result = ArrayUtility.addElement(result, each);
        }
        for (String each : arr2) {
            result = ArrayUtility.addElement(result, each);
        }
        return result;
    }

    // reverses the array, returns a new array
    public static  int []reverseArray(int []array){

        int [] result = new int [array.length];
        for (int i = array.length-1, j=0 ; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }

    public static  double []reverseArray(double []array){

        double [] result = new double [array.length];
        for (int i = array.length-1, j=0 ; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }

    public static  char []reverseArray(char []array){

        char [] result = new char [array.length];
        for (int i = array.length-1, j=0 ; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }

    public static  String []reverseArray(String []array){

        String [] result = new String [array.length];
        for (int i = array.length-1, j=0 ; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }

    // replaces the element of an array at given index with a new element
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

    // replaces all the element of the array that matching with the given old element with the given new element, returns a new array
    public static int []replaceAll (int [] array, int oldElement, int newElement){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;
    }

    public static double []replaceAll (double [] array, double oldElement, double newElement){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;
    }

    public static char []replaceAll (char [] array, char oldElement, char newElement){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;
    }

    public static String []replaceAll (String [] array, String oldElement, String newElement){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldElement)){
                array[i]=newElement;
            }
        }
        return array;
    }

    //removes te duplicates from the given array, returns a new array
    public static int [] removeDuplicates (int [] array){

        int [] result = {};
        for (int each : array) {
            if (!(ArrayUtility.contains(result,each))){
                result = ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static double [] removeDuplicates (double [] array){

        double [] result = {};
        for (double each : array) {
            if (!(ArrayUtility.contains(result,each))){
                result = ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static char [] removeDuplicates (char [] array){

        char [] result = {};
        for (char each : array) {
            if (!(ArrayUtility.contains(result,each))){
                result = ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static String [] removeDuplicates (String [] array){

        String [] result = {};
        for (String each : array) {
            if (!(ArrayUtility.contains(result,each))){
                result = ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }


}






