package day22_CustomMethod;

public class printEachChar<array> {
    public static void main(String[] args) {
        oddNumbers();

        evenNumbers();

        isEligibleForAlcochol(17,false);

        eligibleToVote(21,"usa");

        grade(67);

        circleArea(2);

        squareArea(15);

        dollarEuro(10,0.88);

        dollarLira(10, 13.78);

        kgs(10);

        positiveNegativeZero(0);

        System.out.println("-------------");

        printEachChar("mama");

        printEachElement(new int [] {1,2,3});

        System.out.println("-------------");

        calculator(2,2,'+');

        System.out.println("-------------");

        nameOfPerson("irIna","ORLOVA");

    }

    public static void oddNumbers(){

        for (int i = 1; i <= 100; i+=2) {
            System.out.print(i+ " ");

        }
        System.out.println();

    }

    //create a method that can print odd numbers between 1~100 in a same line saperated by space
    public static void evenNumbers() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    // create a method that can print even numbers between 1~100 in a same line saperated by space

public static void isEligibleForAlcochol(int age, boolean hasID){
        if (age>=18){
            if (hasID == true){
                System.out.println("Eligible");
            }else {
                System.out.println("Not eligible");
            }
        }else {
            System.out.println("Not eligible");
        }

}
    //create a method that can check if a person is eligible to buy alcohol

public static void eligibleToVote(int age, String citizenship){
        if (age>=21){
            if(citizenship.equalsIgnoreCase("USA")){
                System.out.println("You are eligible to vote");
            }else {
                System.out.println("You are not eligible to vote");
            }
        }else if (age <21){
            System.out.println("You are not eligible to vote");
        }
        else {
            System.out.println("Invalid input");
        }

}

    /*create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");
			output:
				You are not eligible to vote!*/

public static void grade(int score){
    char grade = 'A';
    if (score>=60&&score<=100) {
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println(grade);
    }else {
        System.out.println("Invalid score");
    }

}

//create a method that can calculate the grade of the student based on the score

public static void circleArea(double radius){
        double area = radius*radius*3.14;
    System.out.println(area);
}
    //create a method that can calculate the area of a circle

public static void squareArea(double lenthOfSide){
    double area = lenthOfSide*lenthOfSide;
    System.out.println(area);
}

   // create a method that can calculate the area of a square

    public static void dollarEuro (int dollars, double euroCourse){
    int totalEuro = (int) (dollars*euroCourse);
        System.out.println(totalEuro);
    }
    //create a method that can convert dollar to euro

    public static void dollarLira (int dollars, double liraCourse){
        int totalLira = (int) (dollars*liraCourse);
        System.out.println(totalLira);
    }
    //create a method that can can convert dollar to lira

    public static void kgs (int kg){
    double lb = kg* 2.20462;
        System.out.println(lb);
    }
    //create a method that can convert kg to lb

    public static void positiveNegativeZero (int number){
     String result = (number>0)? number+" is positive":(number<0)? number+" is negative": number+" is zero";
        System.out.println(result);
     }

    //create a method that can if the given integer is positive, negative or zero

    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }


    }
    /*create a method named printEachChar that can print each characters of a string */


    public static void printEachElement(int [] array){

        for (int i : array) {
            System.out.println(i);
        }
        }

//create a method named printEachElement that can print each elements of an integer array

    public static void calculator (int num1, int num2, char operator){
        if (operator =='*'){
            System.out.println(num1*num2);
        } else if (operator =='+'){
            System.out.println(num1+num2);
        }else if (operator =='/') {
            System.out.println(num1 / num2);
        } else if (operator =='-') {
            System.out.println(num1 - num2);
        } else {
            System.out.println("Invalid opeerator");
        }
}
//create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result

public static void nameOfPerson(String firstName, String lastName){
        String output = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() + " " +
                lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
    System.out.println(output);

}
/*write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"*/






}


