package day17_WhileLoop;

public class Division {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 1;
        int result = 0;
        int substracrionResult=num1;
        while (substracrionResult >= num2) {  // or (num1>num2)

            substracrionResult=substracrionResult -num2;
            result++;
        }
        System.out.println(result);

/*int a = 50; //a =30-7=23-7=16 -7 =9 - 7 = 2
        int b = 9;
        int count = 0; // count = 1+1=2+1 = 3+1 =4
       while(a >= b){
           a -= b;
           count++;*/
    }
}
/*Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
* */