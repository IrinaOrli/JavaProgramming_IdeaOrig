package day33_Statics;

import java.util.Arrays;

public class StudentObj {
    public static void main(String[] args) {


    Student student1 = new Student("Irina");
        System.out.println(student1);
        Student student2 = new Student("Ahmet",'M');
        System.out.println("student2 = " + student2);
        Student student3 = new Student("Nigara",'F',25);
        Student student4 = new Student("Mert", 'M', 32, 121212,'A');

        Student[]students={student1,student2,student3,student4};
        System.out.println(Arrays.toString(students));

}

}
