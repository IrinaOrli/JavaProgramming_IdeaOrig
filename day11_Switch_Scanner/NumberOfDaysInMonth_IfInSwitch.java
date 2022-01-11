package day11_Switch_Scanner;

public class NumberOfDaysInMonth_IfInSwitch {
    public static void main(String[] args) {

        int year = 2000;
        int num = 5;
        int daysInMonth; // or String result
        if (num >= 1 && num <= 12) {
            switch (num) {

                case 2:
                    if (year%4==0) {   //(year%4==0)? 29 : 28
                        daysInMonth = 29;
                    }else {
                        daysInMonth =28;
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
                default:
                    daysInMonth = 31;
            }
            System.out.println(daysInMonth + " days");

        } else {
            System.out.println("Invalid Number");
        }
            /// System.out.println (result)
    }
}
