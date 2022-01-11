package day08_IfStatement;

public class SingleIfStatement {
    public static void main(String[] args) {

        int number = 301;



        boolean evenNumber = number%2 ==0;
        if (evenNumber){
            System.out.println(number + " is even number");
        }

        if (!evenNumber) { //not even number
            System.out.println(number + " is odd number");
        }
        /*else {
            System.out.println(number + " is odd number");
        }*/

        int n = 200;

        // positive
        if(n > 0){ //if the n is greater than zero, then it's positive
            System.out.println(n+" is positive");
        }

        // negative
        if(n < 0){ // if n is less than zero, then it's negative
            System.out.println(n+" is negative");
        }

        // zero
        if(n == 0) {
            System.out.println(n + " is zero");
        }


    }
}
