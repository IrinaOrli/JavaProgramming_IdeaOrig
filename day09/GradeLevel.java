package day09;

public class GradeLevel {
    public static void main(String[] args) {
        /*Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

            Assume that the given number is 1 ~ 18
            */

    byte gradeLevel = 6;

    boolean isElementary = gradeLevel <=5;
    boolean isMiddle = !isElementary && gradeLevel<=8;
    boolean isHigh = !isMiddle&&!isElementary&&gradeLevel<=12;
    boolean isCollege = !isMiddle&&!isElementary&&!isHigh&& gradeLevel<=16;
    boolean isGrad =!isMiddle&&!isElementary&&!isHigh&&!isCollege;//&&gradeLevel<=18

    if (isElementary){
        System.out.println("Elementary school");
    }
    if (isMiddle){
            System.out.println("Middle school");
    }
    if (isHigh){
            System.out.println("High school");
    }
    if (isCollege){
            System.out.println("College");
    }
    if (isGrad){
            System.out.println("Grad School");
    }
    }

}
