package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {
   /*Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT */

        byte gradeLevel = 18;
        String gradeResult ="";

        if (gradeLevel >=1&&gradeLevel<=18){
            if (gradeLevel >=17){
                gradeResult="Grad School";
            }else if (gradeLevel>=13){
                gradeResult = "College";
            }else if (gradeLevel>=9){
                gradeResult = "High school";
            }else if (gradeLevel>=6){
                gradeResult = "Middle school";
            }else {
                gradeResult = "Elementary school";
            }
        }else {
            gradeResult = "Invalid grade level given";
        }
        System.out.println(gradeResult);



    }
}
