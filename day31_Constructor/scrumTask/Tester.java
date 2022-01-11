package day31_Constructor.scrumTask;

public class Tester {
    public String name;
    public int id;
    public String jobTitle;
    public double salary;


    public Tester(String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void ticketCreating(){
        System.out.println(name + "is creating ticket");
    }
    public void smokeTesting(){
        System.out.println(name + "is smoke testing");
    }
    public void dailyStandUp(){
        System.out.println(name + "is standing up");
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
