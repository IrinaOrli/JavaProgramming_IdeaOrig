package Day14_String;

import java.util.Scanner;

public class EndsInLy {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.next();

        //if (word.substring(word.length()-2).equals("ly")) {
        if (word.endsWith("ly")){
            System.out.println("really???");
        } else
            System.out.println("never mind");

    }
}
/*ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"
*/