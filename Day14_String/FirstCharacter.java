package Day14_String;

import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.next();
        char firstCharacter = word.charAt(0);
        if (firstCharacter >='0'&& firstCharacter<='9'){
            System.out.println("First character is digit");
        }else if (firstCharacter >='a' && firstCharacter <='z'){
            System.out.println("First character is lowercase letter");
        }else if (firstCharacter >='A' && firstCharacter <='Z'){
        System.out.println("First character is uppercase letter");
    } else
            System.out.println("First character is special character");

    }
}
/*if the word starts with digits, print "first character is digit"
if the word starts with uppercase letters, print "first character
is lowercase letter"
if the word starts with lowercase letters, print "first character
is uppercase letter"
if the word starts with special characters, print "first character
is special character"
*/