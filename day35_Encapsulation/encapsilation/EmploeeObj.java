package day35_Encapsulation.encapsilation;

public class EmploeeObj {
    public static void main(String[] args) {

        Employee e1 = new Employee("A",'M',56,20000);
        e1.setAge(32);

        Employee e2 = new Employee("B", 'F', 31, 115000);
        e2.setSalary(e2.getSalary()+15000);

        System.out.println(e1);
        System.out.println(e2);

    }


}
