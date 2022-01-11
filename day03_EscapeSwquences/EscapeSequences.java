package day03_EscapeSwquences;
/* Escape sequences: MUST be given with double quote
    \n: starts a new line
    \t: paragraph space (tab)
    \\: single back slash
    \": double quote

 */
public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Java\nPython\nC#");

        System.out.println("--------------------------");

        System.out.println("Hello Cydeo! \n\nHow are you today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("--------------------------");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("--------------------------");

        System.out.println("/\\"); // in order to print 1 backward slash we need to give 2 backward slashes. FOR 2 SLASHES - 4 BACKWARD SLASHES.

        System.out.println("--------------------------");

        System.out.println("My favourite TV show is \"Game of Throne\""); // in order to print " (double quotes) we need to use \"

       // System.out.println("My favourite TV show is 'Game of Throne'");

    }
}
