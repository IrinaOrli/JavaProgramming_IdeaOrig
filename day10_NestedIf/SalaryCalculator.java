package day10_NestedIf;

public class SalaryCalculator {
    public static void main(String[] args) {
        /*Write a program that can calculate the salary after tax based on the
        following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax

        int salaryBeforeTax = 75000;
        int salaryAfterTax;
        String maritalStatus = "Married";
        boolean isNotMarried = maritalStatus != "Married";

        if (salaryBeforeTax >= 130_000) {
            if (isNotMarried) {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * (35 / 100.0)));
            } else {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * ((35 - 5) / 100.0)));
            }
        } else if (salaryBeforeTax >= 100_000 && salaryBeforeTax <= 129_000) {
            if (isNotMarried) {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * (30 / 100.0)));
            } else {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * ((30 - 5) / 100.0)));
            }
        } else if (salaryBeforeTax >= 80_000 && salaryBeforeTax <= 99_000) {
            if (isNotMarried) {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * (25 / 100.0)));
            } else {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * ((25 - 5) / 100.0)));
            }
        } else {
            if (isNotMarried) {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * (20 / 100.0)));
            } else {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * ((20 - 5) / 100.0)));
            }
        }
        System.out.println(salaryAfterTax);
        System.out.println("=====================================================");

        /*int tax = 0;
        int taxIfMarried = (tax-5);
        int salaryAfterTax1 = (int) (salaryBeforeTax - (salaryBeforeTax * (tax/ 100.0)));*/


       /* if (isNotMarried) {
            if (salaryBeforeTax >= 130_000) {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * (35 / 100.0)));
            } else if (salaryBeforeTax >= 100_000 && salaryBeforeTax <= 129_000) {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * (30 / 100.0)));
            } else if (salaryBeforeTax >= 80_000 && salaryBeforeTax <= 99_000) {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * (25 / 100.0)));
            } else {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * (20 / 100.0)));
            }
        } else {
            if (salaryBeforeTax >= 130_000) {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * ((35 - 5) / 100.0)));
            } else if (salaryBeforeTax >= 100_000 && salaryBeforeTax <= 129_000) {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * ((30 - 5) / 100.0)));
            } else if (salaryBeforeTax >= 80_000 && salaryBeforeTax <= 99_000) {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * ((25 - 5) / 100.0)));
            } else {
                salaryAfterTax = (int) (salaryBeforeTax - (salaryBeforeTax * ((20 - 5) / 100.0)));
            }
        }
        System.out.println(salaryAfterTax);

        System.out.println("------------------------------------------");

        if (isNotMarried) {
            salaryAfterTax = (salaryBeforeTax >= 130_000) ? (int) (salaryBeforeTax - (salaryBeforeTax * (35 / 100.0))) :
                    (salaryBeforeTax >= 100_000 && salaryBeforeTax <= 129_000) ? (int) (salaryBeforeTax - (salaryBeforeTax * (30 / 100.0))) :
                            (salaryBeforeTax >= 80_000 && salaryBeforeTax <= 99_000) ? (int) (salaryBeforeTax - (salaryBeforeTax * (25 / 100.0))) :
                                    (int) (salaryBeforeTax - (salaryBeforeTax * (20 / 100.0)));
            System.out.println(salaryAfterTax);
        } else {
            salaryAfterTax = (salaryBeforeTax >= 130_000) ? (int) (salaryBeforeTax - (salaryBeforeTax * ((35 - 5) / 100.0))) :
                    (salaryBeforeTax >= 100_000 && salaryBeforeTax <= 129_000) ? (int) (salaryBeforeTax - (salaryBeforeTax * ((30 - 5) / 100.0))) :
                            (salaryBeforeTax >= 80_000 && salaryBeforeTax <= 99_000) ? (int) (salaryBeforeTax - (salaryBeforeTax * ((25 - 5) / 100.0))) :
                                    (int) (salaryBeforeTax - (salaryBeforeTax * ((20 - 5) / 100.0)));
        }
        System.out.println(salaryAfterTax);*/

        double salary = 75_000;
        boolean isMarried = true;
        double taxRate = 0;
        if(salary>= 130000 ){ //false: salary < 130000;
            taxRate = 0.35;
        }else if(salary>= 100000 ){ //false: salary < 100000;
            taxRate = 0.30;
        }else if(salary>= 80000 ){ //false: salary < 80000
            taxRate = 0.25;

        }


        if (isMarried){ // if the person is married
                taxRate -= 0.05; // subtracting 5% from the original tax rate
            }

            double salaryAfterTax = salary - (salary*taxRate);
            System.out.println("Salary After Tax = " + salaryAfterTax);



    }
}