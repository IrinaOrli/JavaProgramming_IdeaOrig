package day24_CustomMethod_Return;

public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,78,9};
        int maxNumber = maxNumer(numbers);
        System.out.println(maxNumber);

    }

    public static int maxNumer( int[] numbers){
        int maxNum = 0;
        for (int number : numbers) {
            if (number>maxNum){
                maxNum = number;
            }
        }
        return maxNum;
    }

    //reate a method that can return the maximum number from an array of integers
}
