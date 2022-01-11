package day28_ArrayList;

public class StrongPassword2 {

    public static void main(String[] args) {

        String password = "cLdeo1900@";
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);
           if (Character.isUpperCase(each)){
               countUpperCase++;
           }
           else if (Character.isLowerCase(each)){
                countLowerCase++;
            }
           else if (Character.isDigit(each)){
                countDigits++;
            }
           else {
               countSpecialChar++;
           }
        }

     // boolean hasUpperCase = countUpperCase>0;
     // boolean hasLowerCase = countLowerCase>0;
     // boolean hasDigit = countDigits>0;
     // boolean hasSpecialChar = countSpecialChar>0;

        boolean isStrongPassword = password.length()>=8&&!password.contains(" ")&& countDigits>0&&countLowerCase>0&&countUpperCase>0&&countSpecialChar>0;
        System.out.println("isStrongPassword = " + isStrongPassword);
    }

}
