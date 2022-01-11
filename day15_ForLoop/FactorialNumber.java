package day15_ForLoop;

public class FactorialNumber {
    public static void main(String[] args) {
        int number = 3;
        int factorial = 1;
        for (int n = number; n >=1; n--) {
            factorial *=n;

        }
        System.out.println(factorial);
    }
}
/*Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
                	*/