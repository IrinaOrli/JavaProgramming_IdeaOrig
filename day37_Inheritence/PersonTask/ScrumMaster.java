package day37_Inheritence.PersonTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, String companyName, int id, double salary) {
        super(name, age, gender, "Scrum Master", companyName, id, salary);
    }

}
