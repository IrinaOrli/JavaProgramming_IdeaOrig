package day10_NestedIf;

public class GrageReport {
    public static void main(String[] args) {
        int score = 95;
        if (score >=0 && score <=100){ // if the score is valid
            //5 possibilities: A,B,C,D,F
            if (score >=90) { //false if the score < 90
                System.out.println("Excellent");
            }else if (score >=80){
                    System.out.println("Great");
            }else if (score >=70){
                System.out.println("Good");
            }else if (score >=60) {
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        } else { // if score is NOT valid
            System.out.println("Invalid Score");
        }

        System.out.println("---------------");


        String gradeReport = (score >=0 && score <=100)? (score >=90)? "Excellent": (score >=80)? "Great" :
                (score >=70)? "Good" : (score >=60)? "Passed" : "Failed" : "Invalid Score";
        System.out.println(gradeReport);


        System.out.println("---------------");

        String result = "";
        if (score >=0 && score <=100){
            result = (score >=0 && score <=100)? (score >=90)? "Excellent": (score >=80)? "Great" :
                    (score >=70)? "Good" : (score >=60)? "Passed" : "Failed" : "Invalid Score";

        } else {
            result = "Invalid Score";
        }
        System.out.println(result);
        }


        }




/* with one print statement
 int score = 95;
 String result = "";//temporary
        if (score >=0 && score <=100){ // if the score is valid
            //5 possibilities: A,B,C,D,F
            if (score >=90) { //false if the score < 90
                result = "Excellent";
            }else if (score >=80){
                result = "Great";
            }else if (score >=70){
                result = "Good";
            }else if (score >=60) {
                result = "Passed";
            }else {
                result = "Failed";
            }
        } else { // if score is NOT valid
            result = "Invalid Score";
        }
 */