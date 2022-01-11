package day31_Constructor;

public class SalaryCalculator {
    int hourlyRate, weeklyHours;
    double stateTaxRate, federalTaxRate;

    public SalaryCalculator(int hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public int  salaryBeforeTaxes() {
      int salaryBeforeTax =  hourlyRate * weeklyHours * 52;
        return salaryBeforeTax;
    }
    public double stateTax(){
       double stateTaxTotal = salaryBeforeTaxes()*(stateTaxRate/100);
       return stateTaxTotal;
    }
    public double federalTax(){
        double federalTaxTotal = salaryBeforeTaxes()*(federalTaxRate/100);
        return federalTaxTotal;
    }
    public int  salaryAfterTaxes() {
        int salaryAfterTax = (int) (salaryBeforeTaxes()-stateTax()-federalTax());
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate= $" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salaryAfterTaxes= $" + salaryAfterTaxes() +
                '}';
    }
}
