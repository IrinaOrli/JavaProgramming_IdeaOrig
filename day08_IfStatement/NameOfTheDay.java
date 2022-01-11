package day08_IfStatement;

public class NameOfTheDay {
    public static void main(String[] args) {

       /*Create a class called NameOfTheDay, write a program that can display the name of the day

            number = 1 ~ 7*/

    int number = 7;
        boolean Monday = number  == 1;
        boolean Tuesday = number  == 2;
        boolean Wednesday = number  == 3;
        boolean Thursday = number  == 4;
        boolean Friday = number  == 5;
        boolean Saturday = number  == 6;
        boolean Sunday = number  == 7;
        if (Monday){
            System.out.println("Monday");
        }
        if (Tuesday){
            System.out.println("Tuesday");
        }
        if (Wednesday){
            System.out.println("Wednesday");
        }
        if (Thursday){
            System.out.println("Thursday");
        }
        if (Friday){
            System.out.println("Friday");
        }
        if (Saturday){
            System.out.println("Saturday");
        }
        if (Sunday){
            System.out.println("Sunday");
        }

    }
}
