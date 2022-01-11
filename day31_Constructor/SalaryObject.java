package day31_Constructor;

public class SalaryObject {
    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator(30,40,6,10);

        System.out.println("salary1 = " + salary1);

        System.out.println(salary1.salaryBeforeTaxes());






    }
}
