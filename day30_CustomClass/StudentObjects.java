package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

Student student1 = new Student();
student1.setInfo("Aygun", 'F', 39, 2210,'A');

        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 26, 2123,'B');


        Student student3 = new Student();
        student3.setInfo("Elminur", 'F', 26, 2210,'A');

        Student student4 = new Student();
        student4.setInfo("Ali", 'M', 28, 5511,'B');

        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 26, 2252,'C');


        Student[]studentArray = {student1,student2,student3,student4,student5};
        for (Student eachStudent : studentArray) {
            System.out.println(eachStudent);
        }
        System.out.println("--------------------------");


        ArrayList<Student>earlyBirds = new ArrayList<>();// grade A
        ArrayList<Student>angryBirds = new ArrayList<>();// not grade A

        for (Student each : studentArray) {
            if (each.grade=='A'){
                earlyBirds.add(each);
            }
            else {
                angryBirds.add(each);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);


    }
}
