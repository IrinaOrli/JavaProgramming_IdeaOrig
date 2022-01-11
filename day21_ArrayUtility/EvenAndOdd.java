package day21_ArrayUtility;

public class EvenAndOdd {
    public static void main(String[] args) {

        int [] allNumbers = {1,2,3,4,5,6,7,8,9};
        int countEven = 0;
        int countOdds = 0;

        for (int number : allNumbers) {
            if (number%2==0){
                countEven++;
            }
            else {
                countOdds++;
            }
        }
        System.out.println(countEven + " even");
        System.out.println(countOdds + " odd");





    }
}
/*Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop*/