package day08_IfStatement;

public class IfStatments {
    public static void main(String[] args) {

       int score = 85; //0~100
        boolean a = score >=90 && score <= 100;
        boolean b = score >=80 && !a; // boolean b = score >=80 && score <=89
        boolean c =  !a && !b && score >=70; // boolean c = score >=70 && score <=79
        boolean d = score >= 60&& score <=69;
        boolean f =  !a&& !b && !c && !d ; //boolean f = score>=0 && score <= 59

        if(a) { //if the student made an A
            System.out.println("Excellent");
        }

        if(b) { // if the student made a B
            System.out.println("Great");
        }

        if(c) { // if the student made a C
            System.out.println("Good");
        }

        if(d) { // if the student made a D
            System.out.println("Passed");
        }

        if(f) { // if the student made F
            System.out.println("Failed");
        }
       /*90~100 Exellent
       80~89 Great
       70~79 Good
       60~69 Passed
       0~59 Failed
         */

    }
}
