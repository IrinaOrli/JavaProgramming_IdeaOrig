package day27_WrapperClasses;

public class Retrieve {

    public static void main(String[] args) {
        String str = "Wooden Spoon!";
        String letters = "";
        String digits = "";
        String specialChars = "";
        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                digits += each;
            } else if (Character.isLetter(each)) {
                letters += each;
            } else {
                specialChars += each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = \"" + digits+ "\";");
        System.out.println("specialChars = " + "\""+ specialChars+ "\";");
    }
}
/*Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
* */