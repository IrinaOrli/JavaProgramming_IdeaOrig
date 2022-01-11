package Day14_String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an account number:");
        String accountNumber = scanner.nextLine();

        char firstDigit = accountNumber.charAt(0);
        int length = accountNumber.length();
        String result = "";

        if (firstDigit =='2' && length ==7){
            result = "Valid account number";
        }else if (firstDigit =='5' && length ==10){
            result = "Valid account number";
        }else
            result = "Invalid account number";

        System.out.println(result);
    }

}
/*Create a class called AccountNumber.
Ask the user enter an account number (String). Check if these
account number is valid.
> If the account number begins with a â2â the account
number should be 7 characters long
> If the account number begins with a â5â the account
number should be 10 characters long
â> If the account number does not begin with a 2 or a 5 OR
the account number lengths
do not meet the expected results print âInvalid
account numberâ
*/