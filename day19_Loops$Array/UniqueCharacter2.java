package day19_Loops$Array;

public class UniqueCharacter2 {
    public static void main(String[] args) {

        String str = "mamanya";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            int count = 0; // represent the frequency of the ch
            char ch = str.charAt(j) ;

                for (int i = 0; i < str.length(); i++) { //index numbers of the str
                    char each = str.charAt(i);
                    if (ch == each) {
                        count++;
                    }
                }
            if (count==1){//if the character is unique
                result+=ch;
            }
            }
        System.out.println(result);
        }
    }

/*Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique
*/