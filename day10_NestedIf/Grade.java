package day10_NestedIf;

public class Grade {
    public static void main(String[] args) {

        /*Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
*/

        char grade= 'A';
        String message = "";

        if (grade>='A'&&grade<='D'||grade=='F'){
            if (grade == 'A'){
                message = "Excellent";
            }else if (grade=='B'){
                message= "Great job";
            }else if (grade=='C'){
                message="Good";
            }else if (grade=='D'){
                message="Passed";
            }else {
                message = "Failed";
            }
        }else {
            message ="Invalid input";
        }
        System.out.println(message);

        System.out.println("--------------------------------------");

        message = (grade == 'A' || grade == 'B' || grade=='C' || grade=='D' || grade=='F')? (grade=='A')? "Excellent" :
                (grade=='B')? "Great job": (grade=='C')? "Good": (grade=='D')? "Passed": "Failed": "Invalid input";
        System.out.println(message);
    }
}
