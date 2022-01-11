package day09;

public class MinNumber {
    public static void main(String[] args) {
//Minimum number between two different numbers
        int num1 = 12, num2 = 25;
        int minNumber;

        if (num1<num2) {
            minNumber = num1;
        }
        else {
            minNumber = num2;
        }
        System.out.println(minNumber + " is the Minimum number");
    }
}
