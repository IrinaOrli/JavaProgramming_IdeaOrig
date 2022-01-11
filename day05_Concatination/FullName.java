package day05_Concatination;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Cydeo";
        String lastName = "School";
        int age = 45;
        String jobTitle = "SDET";
        String companyName = "Apple Inc.";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is " + fullName + ".");
        //Full name of the person is _____

        System.out.println(fullName + " is " + age + " years old.");
       //____ is ___ years old.

        //FullName is jobTitle, works at companyName, salary is Salary.

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                + ", salary is $" + salary + ".");


       // mine System.out.println(firstName + " " + lastName);

    }
}
