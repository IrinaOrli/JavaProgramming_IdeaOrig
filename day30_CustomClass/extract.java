package day30_CustomClass;

import java.util.ArrayList;

public class extract {
    public static void main(String[] args) {

       String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add (str.charAt(i));
        }
        ArrayList<Character> letters = new ArrayList<>(chars);// add all the characters
        letters.removeIf(p->!Character.isLetter(p)); // remove characters that are not letters

        ArrayList<Character> digits = new ArrayList<>(chars);// add all the characters
        digits.removeIf(p->!Character.isDigit(p)); // remove characters that are not digits

        ArrayList<Character> specialChars = new ArrayList<>(chars);// add all the characters
        specialChars.removeAll(letters); // remove characters that are not special chars
        specialChars.removeAll(digits);

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}
/*Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
*/