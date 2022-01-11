package day20_Array;
import java.util.Arrays;
public class MinimumNumber {
    public static void main(String[] args) {

        int[] number = {10, 5, 4, 1, 1};
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }

        }
        System.out.println(min);

    }
}
