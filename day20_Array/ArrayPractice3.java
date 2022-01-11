package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers you want ot enter:");
        int lenth = scan.nextInt();

        if (lenth <=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        int[] numbers = new int [lenth];
        for (int i = 0; i < lenth; i++) {
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

    }
}
