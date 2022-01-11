package day09;

public class Cigarettes {
    public static void main(String[] args) {

        //Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes

   byte age = 16;
   boolean IsEligible = age>=21;

   if (IsEligible) {
       System.out.println("Is eligible to purchase cigarettes");
   }
   if (!IsEligible){
       System.out.println("Is not eligible to purchase cigarettes");
   }

    }
}
