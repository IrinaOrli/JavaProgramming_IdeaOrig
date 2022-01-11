package day27_WrapperClasses;

public class UpperAndLowerCaseCharacters {

    public static void main(String[] args) {
        String str = "JAVA java ";
        System.out.println(UpperAndLowerCaseCharacters.upperAndLowerCase(str));

    }
    public static boolean  upperAndLowerCase (String str){

        int countUpperCase = 0;
        int countLowerCase = 0;

        for (char each : str.toCharArray()) {

           if (Character.isUpperCase(each)){
            countUpperCase++;
            }
            if (Character.isLowerCase(each)){
               countLowerCase++;
            }
    }

        boolean isEqualNumber = countUpperCase==countLowerCase;
        return isEqualNumber;
    }
}
/*Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true*/