package Day14_String;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.next();
        char firstChar = word.charAt(0);

        //if (firstChar == 'x') {
         //   word = word.substring(1);
if (word.startsWith("x")){
    word = word.replaceFirst("x","");
        }
        System.out.println(word);
    }
}
/*Ask user to enter a word. If the work starts with x, print the
word without x.
Input:
xcode
Output:
code
*/