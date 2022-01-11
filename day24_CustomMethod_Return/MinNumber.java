package day24_CustomMethod_Return;

public class MinNumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,78,-9};
        int maxNumber = minNumer(numbers);
        System.out.println(maxNumber);
    }
    public static int minNumer( int[] numbers){
        int minNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i]<minNum){
                minNum = numbers[i];
            }

        }
        return minNum;
    }

    //create a method that can return the minimum number from an array of integers

}
