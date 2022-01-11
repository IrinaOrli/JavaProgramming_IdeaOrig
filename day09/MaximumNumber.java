package day09;

public class MaximumNumber {
    public static void main(String[] args) {

        /*Write a program that can print the maximum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                200 is the maximum number
                */

        int n1= 200, n2 = 200;
        boolean n1isMax = n1 > n2;
        boolean n2IsMax = n2 > n1;
        boolean equal = n1 ==n2;

        if (n1isMax){
            System.out.println(n1 + " is the maximum number");
        }

        if (n2IsMax) {
            System.out.println(n2 + " is the maximum number");
        }

        if (!n1isMax&&!n2IsMax){
            System.out.println(n1 + " equals to " + n2);
        }

    }
}
