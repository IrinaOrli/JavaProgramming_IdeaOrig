package day37_Inheritence.PersonTask;

public class BusinessAnalyst extends Employee {
    public BusinessAnalyst(String name, int age, char gender,  String companyName, int id, double salary) {
        super(name, age, gender, "Business Analyst", companyName, id, salary);
    }
    public void analize(){
        System.out.println(jobTitle+name+" is analyzing the dox");
    }
}
