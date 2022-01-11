package day10_NestedIf;

public class OxygenTank {
    public static void main(String[] args) {

/*Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number)
and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY*/

        int oxygeLevel = 39;
        String message = "";

        if (oxygeLevel >= 50 && oxygeLevel <= 100) {
            if (oxygeLevel >= 90) {
                message = "Your tank is full";
            } else if (oxygeLevel >= 80) {
                message = "Still okay";
            } else if (oxygeLevel >= 70) {
                message = "Don't go too far" ;
            } else if (oxygeLevel >= 60) {
                message = "Start to head back";
            } else {
                message = "Be careful now you are at 50%";
            }
        }
        else {
                message = "Error";
            }
        System.out.println(message);

        System.out.println("=========================================");

        message = (oxygeLevel >= 50&&oxygeLevel<=100)? (oxygeLevel>=90)? "Your tank is full" : (oxygeLevel>=80)? "Still okay" :
                (oxygeLevel>=70)? "Don't go too far" : (oxygeLevel>=60)? "Start to head back" : "Be careful now you are at 50%" :
                "Error";
        System.out.println(message);




    }
}
