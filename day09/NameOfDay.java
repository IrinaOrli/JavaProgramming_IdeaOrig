package day09;

public class NameOfDay {
    public static void main(String[] args) {

        int n =2; //1~7
        String day;

        if (n==1){
            //System.out.println("Monday");
            day = "Monday";
        }
        else if (n==2){
            day = "Tuesday";
            //System.out.println("Tuesday");
        }
        else if (n==3){
            day = "Wednesday";
            //System.out.println("Wednesday");
        }
        else if (n==4){
            day = "Thursday";
            //System.out.println("Thursday");
        }
        else if (n==5){
            day = "Friday";
            //System.out.println("Friday");
        }
        else if (n==6) {
            day = "Saturday";
            //System.out.println("Saturday");
        }
        else if (n==7){
            day = "Sunday";
            //System.out.println("Sunday");
        }
        else {
            day = "Invalid";
            //System.out.println("Invalid");
        }
        System.out.println(day);
    }


}
