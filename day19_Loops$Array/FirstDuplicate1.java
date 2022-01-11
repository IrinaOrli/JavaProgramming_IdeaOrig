package day19_Loops$Array;

public class FirstDuplicate1 {
    public static void main(String[] args) {
        String str = "bcdaajjjdddjmnllllmsst";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char everyChar = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char ofStr = str.charAt(i);
                if (everyChar == ofStr) {
                    count++;
                }
            }
            if (count> 1) {
                result += str.indexOf(everyChar);
                break;
            }

        }
        System.out.println(result);
    }

}
