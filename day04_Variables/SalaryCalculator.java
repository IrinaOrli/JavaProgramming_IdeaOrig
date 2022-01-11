package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {

        /* hourlyRate, weeklyHours
        * */

        int hourlyRate =50;
        int weeklyHours = 40;

        int salary = hourlyRate*weeklyHours*52; //52- weeks per year

        System.out.println(salary);
        System.out.println("weeklyHours = " + weeklyHours); // soutv shortcut
        System.out.println("hourlyRate = $" + hourlyRate);


        System.out.println(salary);

    }
}
