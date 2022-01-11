package day15_ForLoop;

public class SumOfOdd {

    public static void main(String[] args) {
        int sum =0;
        for (int i = 1; i < 101;  i+=2) {
        sum +=i;
        }
        System.out.println(sum);

    }
}
/*Write a program that can return the sum of odd numbers between 1 to 100*/