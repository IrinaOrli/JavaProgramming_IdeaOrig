package day17_WhileLoop;

import java.util.Scanner;

public class BranchingStatement {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
            if (i == 'F') {
                break;
            }
            //System.out.print(i+" ");

        }
        System.out.println();

        System.out.println("-------------------");


        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int number = scan.nextInt();

            if (number < 0) {
                break;
            }

           /*    int number =0;
        while (number>=0){
            System.out.println("Enter a number");
            number = scan.nextInt();
             }
*/
            int number1 = 0;
            do {
                System.out.println("Enter a number");
                number1 = scan.nextInt();
            } while (number1 >= 0);

        }
    }
}
