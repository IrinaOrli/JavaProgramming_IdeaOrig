package day16_ForLoopPractice;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str = "mamanya";
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) { //index numbers of the str
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {

                result += ch;
            }

            //} else {
             //   System.out.println("none");

            }
            System.out.println(result);
        }
    }
