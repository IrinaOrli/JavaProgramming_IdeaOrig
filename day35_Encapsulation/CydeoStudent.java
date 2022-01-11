package day35_Encapsulation;

public class CydeoStudent {
    public String name, fieldOfStudy;
    public char gender;
    public int age, batchNumber,groupNumber;

  public static String schoolName,programmingLanguage,secretCode;


    public CydeoStudent(String name, String programmingLanguage, char gender, int age, int batchNumber, int groupNumber, String secretCode) {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.secretCode = secretCode;
    }

    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
        secretCode = "123456";
    }
public static void  printSchoolName(){
    System.out.println("schoolName = " + schoolName);
}
    public static void  printProgrammingLanguage() {
        System.out.println("programmingLanguage = " + programmingLanguage);
    }
    public static void printSecretCode() {
        System.out.println("secretCode = " + secretCode);
    }

    public void attendClass()
    {
        System.out.println(name + " is attending the class");
    }
    public void study()
    {
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage=" + programmingLanguage +
                ", schoolName=" + schoolName +
                '}';
    }
}
/*
* create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()*/