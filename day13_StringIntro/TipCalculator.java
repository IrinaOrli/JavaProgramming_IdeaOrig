package day13_StringIntro;

import java.util.Locale;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)?");
        String split = scanner.next().toLowerCase();

        System.out.println("Enter the number of people");
        int numberOfPeople = scanner.nextInt();

        System.out.println("Enter the check amount:");
        double totalCheck = scanner.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = scanner.next().toLowerCase();

        double totalTipsPoor = totalCheck * 0.05;
        double totalTipsFair = totalCheck * 0.1;
        double totalTipsGood = totalCheck * 0.15;
        double totalTipsGreat = totalCheck * 0.20;
        double totalTipsExcellent = totalCheck * 0.25;
        double totalTipsSum = 0;

        if (quality.equals("poor")) {
            totalTipsSum = totalTipsPoor;
        } else if (quality.equals("fair")) {
            totalTipsSum = totalTipsFair;
        } else if (quality.equals("good")) {
            totalTipsSum = totalTipsGood;
        } else if (quality.equals("great")) {
            totalTipsSum = totalTipsGreat;
        } else if (quality.equals("excellent")) {
            totalTipsSum = totalTipsExcellent;
        } else
            System.out.println("Invalid input");

        if (split.equals("yes")) {
            double TotalPerPerson = totalCheck / numberOfPeople;
            double TipPerPerson = totalTipsSum / numberOfPeople;
            System.out.println("Number of people entered: " + numberOfPeople);
            System.out.println("Total to pay: " + (totalCheck + totalTipsSum));
            System.out.println("Total tip: " + totalTipsSum);
            System.out.println("Total per person: " + (totalCheck + totalTipsSum) / numberOfPeople);
            System.out.println("Tip per person: " + totalTipsSum / numberOfPeople);

        }
        else  {
            System.out.println("Number of people entered: " + numberOfPeople);
            System.out.println("Total to pay: " + (totalCheck + totalTipsSum));
            System.out.println("Total tip: " + totalTipsSum);


        }
    }
    }

/*Create a class called TipCalculator, write a program for a tip
calculator.
There will be different service quality benchmarks that will determine the
tip given.
There will also the ability to calculate based on the number of people in
the party and if there is a split of the bill or not.
Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent
= 25%
The program should display the following information based on the
user input:
Split or No split (Yes or No),  Number of people entered: (number)
(each person = & in output) Check amount: (number) Service Quality:
(String) Total to pay: Total tip: Total per person: Tip per person:
Ex:
Split or No split (Yes or No)?
Yes
Enter the number of people
4
Enter the check amount:
476
How was the srvice quality?
(Excellent/Great/Good/Fair/Poor)
Excellent
output:
Number of people entered: 4
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
HINT: you will need to use .equals() method*/