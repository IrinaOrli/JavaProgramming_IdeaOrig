package day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static int maxNumber (int number1, int number2){
int maxNumber =0;
        if (number1>number2){
            maxNumber =number1;
        }else {
            maxNumber= number2;
        }
        return maxNumber;
    }

    public static void main(String[] args) {

        int max = maxNumber(1,2);
        System.out.println(max);
      //  System.out.println(max*2);
        int multilpyByTwo = max*2;
        System.out.println(multilpyByTwo);


    }

}
