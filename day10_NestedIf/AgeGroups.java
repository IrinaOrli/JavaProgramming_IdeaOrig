package day10_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {
        /*Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
             */

        int age = 25;
        String ageGroup = "";

        if (age>=0&&age<=150){
            if (age>=55){
                ageGroup = "Senior";
            }else if (age>=21){
                ageGroup = "Adult";
            }else {
                ageGroup ="Teenager";
            }
        }else {
            ageGroup = "Invalid input";
        }System.out.println(ageGroup);


        System.out.println("------------------------------");

        ageGroup = (age>=0&&age<=150)? (age>=55)? "Senior" : (age>=21)? "Adult": "Teenager" : "Invalid input";
        System.out.println(ageGroup);


    }
}
