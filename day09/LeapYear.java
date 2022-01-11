package day09;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2000;
        boolean leapYear = year%4 ==0; // visa versa???

        if (leapYear){
            System.out.println("Year " + year + " is leap");
        }else{
            System.out.println("Year " + year + " is not leap");
        }
    }
}
