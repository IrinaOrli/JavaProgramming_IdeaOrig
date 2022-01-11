package day05_Concatination;

public class Calculator {
    public static void main(String[] args) {

        int firstNumber = 100;
        int secondNumber = 50;
        int sumResult = firstNumber+secondNumber;
        int subtractionResult = firstNumber-secondNumber;
        int multiplicationResult = firstNumber*secondNumber;

        System.out.println(firstNumber + " + " + secondNumber+ " = " + (sumResult));

        //100+50 = 150

        System.out.println(firstNumber + " - " + secondNumber + " = " + subtractionResult);

        //100-50= 50

        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplicationResult);

        // 100*50 =5000

    }
}
