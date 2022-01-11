package day17_WhileLoop;

import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your gender:");
        String gender = scanner.next();
        while (!(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female"))){
            System.out.println("Invalid input. Please re-enter your gender:");
            gender = scanner.next();
        }
        System.out.println("Are you married?(Yes/No)");
        String isMarried = scanner.next();
        while (!(isMarried.equalsIgnoreCase("yes")||isMarried.equalsIgnoreCase("no"))){
            System.out.println("Invalid input. Please re-enter your marital status:");
            isMarried = scanner.next();
        }

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        while (age<0||age>120) {
            System.out.println("Invalid input. Please re-enter your age:");
            age = scanner.nextInt();
        }
        System.out.println("How many miles do you drive in a day");
        int mileage = scanner.nextInt();
            while (!(mileage>4)) {
                System.out.println("Invalid input. Please re-enter your mileage:");
                mileage = scanner.nextInt();
            }
        scanner.nextLine();

        System.out.println("Do you want a full coverage or a liability insurance");
        String coverage = scanner.nextLine();

        System.out.println("Did you have any accidents or claims in past 5 years?(Yes/No)");
        String wasAccident = scanner.next();
                while (!(wasAccident.equalsIgnoreCase("yes")||wasAccident.equalsIgnoreCase("no"))) {
                    System.out.println("Invalid input. Please re-enter accidents information:");
                    wasAccident = scanner.next();
                }
        System.out.println("Does your car have an anti-theft device? (Yes/No)");
        String hasAntitheft = scanner.next();
                while (!(hasAntitheft.equalsIgnoreCase("yes")||hasAntitheft.equalsIgnoreCase("no"))) {
                    System.out.println("Invalid input. Please re-enter if your car have an anti-theft device:");
                    hasAntitheft = scanner.next();
                }
                    int finalPrice = 0;

                if (coverage.equalsIgnoreCase("liability insurance")) {
            if (age < 25) {
                finalPrice += 90;
            }
            if (age >= 25) {
                finalPrice += 50;
            }
            if (mileage <= 10) {
                finalPrice += 10;
            }
            if (mileage > 10 && mileage <= 50) {
                finalPrice += 30;
            }
            if (mileage > 50) {
                finalPrice += 50;
            }
        }

        if (coverage.equalsIgnoreCase("full coverage")) {
            if (age < 25) {
                finalPrice += 160;
            }
            if (age >= 25) {
                finalPrice += 120;
            }
            if (mileage <= 10) {
                finalPrice += 20;
            }
            if (mileage > 10 && mileage <= 50) {
                finalPrice += 40;
            }
            if (mileage > 50) {
                finalPrice += 70;
            }
        }


                    if (hasAntitheft.equalsIgnoreCase("yes")){
                        finalPrice -= (finalPrice*0.05);
                    }
                    if (wasAccident.equalsIgnoreCase("yes")) {
                        finalPrice += (finalPrice * 0.15);
                    }
                    if (wasAccident.equalsIgnoreCase("no")) {
                        finalPrice -= (finalPrice * 0.10);
                    }
                    if (isMarried.equalsIgnoreCase("yes")){
                        finalPrice -= (finalPrice*0.05);
                    }

                    System.out.println(name + ", your Insurance Quote is $" + finalPrice);

                }
    }



/*Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount*/