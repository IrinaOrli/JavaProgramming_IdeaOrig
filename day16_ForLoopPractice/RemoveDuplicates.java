package day16_ForLoopPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abcrdffeeee";
        String result = " ";

        for (int i = 0; i <= str.length()-1 ; i++) {
            String ch = ""+str.charAt(i);
            if (!result.contains(ch)) {//if caracter is not contained in the result
                result += ch;
            }

            }
            System.out.println(result);


        }

    }
