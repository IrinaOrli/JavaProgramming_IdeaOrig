package day30_CustomClass;

public class Employee {


    public String name;
    public  char gender;
    public int id;
    public int age;
    public String jobTitle;
    public int salary;
    public  boolean isFullTime;


    public void setInfo (String name, char gender, int id, int age, String jobTitle, int salary, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", id=" + id +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work (){
    System.out.println(jobTitle +" " +name + " is working");



    }
}
