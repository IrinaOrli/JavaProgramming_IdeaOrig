package day21_ArrayUtility;

public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 4, 1, 0};
        int max = numbers[0];
        for (int number :numbers) {
            if (number>max){
                max = number;
            }
        }
        System.out.println(max);

    }
}
