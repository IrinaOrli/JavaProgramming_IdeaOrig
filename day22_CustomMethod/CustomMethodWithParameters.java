package day22_CustomMethod;

public class CustomMethodWithParameters
{
    public static void main(String[] args) {
        oddOrEven(10);// the method demands additional info to complete the task
        age(1985,2021);
        numbersBetweenXAndY(1,5);
    }
    public static void oddOrEven(int number){

        if (number%2==0){
            System.out.println(number+" is even");
        }
        else {
            System.out.println(number+" is odd");
        }
    }

    public static void age(int birthYear, int currentYear){
        int age = currentYear-birthYear;
        System.out.println("your age is "+age);
    }

    public static void numbersBetweenXAndY(int x, int y){
        for (int i = x+1; i < y; i++) {
            System.out.println(i);
        }
    }
}

