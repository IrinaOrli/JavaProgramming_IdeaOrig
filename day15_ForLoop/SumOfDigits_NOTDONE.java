package day15_ForLoop;

public class SumOfDigits_NOTDONE {
    public static void main(String[] args) {


        String str = "w7e21";
        String digits = "";
        int sum1 =0 ;
        for (int i = 0; i <= str.length() - 1; i++) {
            char character = str.charAt(i);

        if (character >= '0' && character <= '9') {

                digits  +=character;

            }

        }
        System.out.println("digits = " + digits);

    }

}