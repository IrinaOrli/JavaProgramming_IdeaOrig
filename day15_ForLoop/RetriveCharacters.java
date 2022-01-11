package day15_ForLoop;

public class RetriveCharacters {
    public static void main(String[] args) {


        String str = "wAezaZ21!!     !!?79&%";
        String letters = "";
        String digits = "";
        String specialChars = "";
        for (int i = 0; i < str.length() ; i++) {  // or i <= str.length()-1;

            char character = str.charAt(i);

            if (character >= 65 && character <= 90 || character >= 97 && character <= 122) {
                letters += character;
            } else if (character >= '0' && character <= '9') {
                digits += character;
            } else { // if the character is neither digit nor letter
                if (character != ' ') {// if the character is not a space
                specialChars += character;
            }
        }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }

}


/*write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!*/