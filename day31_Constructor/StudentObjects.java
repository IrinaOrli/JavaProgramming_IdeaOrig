package day31_Constructor;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1= new Student("Irina",36,'F','A',557755);
        Student student2= new Student("Ali", 25, 'M', 'B',302356);

        System.out.println(student1);
        System.out.println(student2);
    }
}
