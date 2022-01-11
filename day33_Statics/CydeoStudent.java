package day33_Statics;

public class CydeoStudent {
    public String name;
    public int age, batchNumber, groupNumber, id;
    public char gender, grade;
    public static String schoolName = "Cydeo";
    public static String programmingLanguage = "Java";

    public CydeoStudent(String name, int age, int batchNumber, int groupNumber, int id, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name+ " is studying");

    }
    public void attendClass(){
        System.out.println(name+ " is attending the class");

    }
    public static void printSchoolName(){
        System.out.println("schoolName = " + schoolName);

    }
    public static void printProgLanguage(){
        System.out.println("programmingLanguage = " + programmingLanguage);

    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", id=" + id +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}


/*Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()*/