package day19_Loops$Array;

public class FrequencyOfChracters {

    public static void main(String[] args) {
        String str = "aabcccd";
        String result = "";


        for (int j = 0; j < str.length(); j++) {//each character from the string


            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {// find the frequency of each character
                char each = str.charAt(i);// each character of the string

                if (ch == each) {
                    count++;
                }
            }
                if (count == 1) {
                    result += ch;
                }

            }

        System.out.println(result);
        }

}