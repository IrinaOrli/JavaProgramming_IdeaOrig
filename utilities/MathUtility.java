package utilities;

public class MathUtility {
    
   // returns the sum of two numbers
    public static int sumOf2Integers(int n1, int n2){
                return n1+n2;
    }
    public static double sumOf2Doubles(double n1, double n2) {
        return n1 + n2;
    }
    
    //subtracts two numbers
    public static int subtractionOf2Integers(int n1, int n2) {
        return n1 - n2;
    }
    public static double subtractionOf2Doubles(double n1, double n2) {
        return n1 - n2;
    }
    
    //multiply two numbers
    public static int multiplicationOf2Integers(int n1, int n2) {
        return n1 * n2;
    }
    public static double multiplicationOf2Doubles(double n1, double n2) {
        return n1 * n2;
}

    //passes two double parameters and returns the division result
    public static int divisionOf2Integers(int n1, int n2) {
        return n1 / n2;
    }
    public static double divisionOf2Doubles(double n1, double n2) {
        return n1 / n2;
    }

    //checks if an integer is even number
    public static boolean isEven (int num){
        boolean isEven =num%2==0;
        return isEven;
    }

    // checks if an integer is odd number
    public static boolean isOdd (int num){
        boolean isOdd =num%2!=0;
        return isOdd;
    }

    //returns the maximum number between two numbers
    public static int maximumNumber (int n1, int n2){
        int maximumNumber =n1;
        if (n1==n2){
            System.out.println("Invalid input. Numbers are equal");
            System.exit(0);
        }
        else if (n1<n2){
            maximumNumber =n2;
        }

        return maximumNumber;
    }
    public static double maximumNumber (double n1, double n2){
        double maximumNumber =n1;
        if (n1==n2){
            System.out.println("Invalid input. Numbers are equal");
            System.exit(0);
        }
        else if (n1<n2){
            maximumNumber =n2;
        }

        return maximumNumber;
    }

    // returns the minimum number between two numbers
    public static int minimumNumber (int n1, int n2){
        int minimumNumber =n1;
        if (n1==n2){
            System.out.println("Invalid input. Numbers are equal");
            System.exit(0);
        }
        else if (n1>n2){
            minimumNumber =n2;
        }

        return minimumNumber;
    }
    public static double minimumNumber (double n1, double n2){
        double minimumNumber =n1;
        if (n1==n2){
            System.out.println("Invalid input. Numbers are equal");
            System.exit(0);
        }
        else if (n1>n2){
            minimumNumber =n2;
        }

        return minimumNumber;
    }

    //returns the square of a number
    public static int squareOfInteger (int number){
        int result = number*number;
        return result;
    }
    public static double squareOfDouble (double number) {
        double result = number * number;
        return result;
    }

     //returns the cube of a number
     public static int cubeOfInteger (int number){
         int result = number*number*number;
         return result;
     }
     public static double cubeOfDouble (double number) {
        double result = number * number*number;
        return result;
    }

}


