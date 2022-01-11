package day35_Encapsulation.encapsilation;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
       setName(name);
       setGender(gender);
       setAge(age);
       setSalary(salary);
    }

    public void setName (String name){
        if (name.isEmpty()){
            System.err.println("Name can not be blank");// or just return;
            System.exit(0);
        }
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGender (char gender){
        if (!(gender=='F'||gender=='M')){
            System.err.println("Gender invalid");
            System.exit(0);
        }
        this.gender = gender;
    }
    public char getGender(){
        return gender;
    }
    public void setAge (int age){
        if (age<=0||age>150){
            System.err.println("Age invalid");
            System.exit(0);
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setSalary (double salary){
        if (salary<=0){
            System.err.println("Salary can not be zero or negative");
            System.exit(0);
        }
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
