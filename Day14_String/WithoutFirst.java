package Day14_String;

import java.util.Scanner;

public class WithoutFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word:");
        String firstWord = scanner.next();

        System.out.println("Enter the second word:");
        String secondWord = scanner.next();

        System.out.print(firstWord.substring(1));
        System.out.println(secondWord.substring(1));
    }
}
/*Ask user to enter two words. Print first word without its first
character
then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana*/