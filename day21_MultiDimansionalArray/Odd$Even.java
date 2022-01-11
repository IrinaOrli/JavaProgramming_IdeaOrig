package day21_MultiDimansionalArray;

public class Odd$Even {
    public static void main(String[] args) {
        int [][] arr2D = { {1,2,3},{4,5,6},{7,8,9, 10} };
        int countEven = 0;
        int countOdd = 0;
        for (int[] each1D : arr2D) {
            for (int each : each1D) {
                if (each%2==0){
                    countEven++;
                }
                else {
                    countOdd++;
                }
            }
        }
        System.out.println(countEven + " even");
        System.out.println(countOdd + " odd");

    }
}
/*Write a program that can count the total odd and even numbers from a two dimensional array
* */