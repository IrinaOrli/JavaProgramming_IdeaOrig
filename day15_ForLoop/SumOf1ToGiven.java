package day15_ForLoop;

public class SumOf1ToGiven {
    public static void main(String[] args) {

        int number = 100;
        int sum = 0;
        for (int n = 1; n <=number; n++) {
            sum +=n;

        }
        System.out.println(sum);
    }
}
/*write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
                */