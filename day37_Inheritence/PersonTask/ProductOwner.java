package day37_Inheritence.PersonTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, String companyName, int id, double salary) {
        super(name, age, gender, "PO", companyName, id, salary);
    }

}
