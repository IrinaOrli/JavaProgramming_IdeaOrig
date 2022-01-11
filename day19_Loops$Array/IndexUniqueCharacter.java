package day19_Loops$Array;

public class IndexUniqueCharacter {
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
                System.out.println(str.indexOf(ch));
                break;
            }
            }

        }
    }

/* Write a program that can return the index number of the first unique character.
*/