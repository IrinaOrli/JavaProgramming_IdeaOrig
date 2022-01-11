package day19_Loops$Array;

public class AppearTwice {
    public static void main(String[] args) {
        String word= "abcvcxaaabcdfgcffss";
        String result="";

        for (int j = 0; j < word.length(); j++) {
            String character = ""+word.charAt(j);
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                String each = word.charAt(i)+"";

                if (each.equals(character+"")) {
                    count++;
                }
            }
                    if (count==2){
                        if (result.contains(character))  {
                            continue;
                        }
                     result +=character;
                }

        }
        System.out.println(result);
        }


    }

/*Write a program that can display all the characters that appeared twice in the string.*/