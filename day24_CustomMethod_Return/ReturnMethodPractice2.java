package day24_CustomMethod_Return;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {

        String gradeResult = grade(100);
        if (gradeResult.equals("A")) {
            System.out.println("Excellent!");
        } else if (gradeResult.equals("B")) {
            System.out.println("Great!");
        } else if (gradeResult.equals("C")) {
            System.out.println("Good!");
        } else if (gradeResult.equals("D")) {
            System.out.println("Passed!");
        }
    }
        public static String grade ( int score){
            String result = "";

            if (score < 0 || score > 100) {
                result = "Invalid score";

            } else {
                result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
            }
            return result;
        }
        // create a function that can calculate the grade
        //check the grade: A -excellent, B-Great...


    }
