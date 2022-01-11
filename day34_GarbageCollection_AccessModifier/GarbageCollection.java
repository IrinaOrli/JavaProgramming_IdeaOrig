package day34_GarbageCollection_AccessModifier;

import day30_CustomClass.Dog;
import day31_Constructor.Student;
import day32_Constructor.Car;
import day33_Statics.IPhone;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
        // int n=null;
       // String str = null;//not an object
        //String str1 = "";//an object

       // System.out.println(str.toUpperCase()); - NullPointerException

        String str = "Wooden Spoon"; // not eligible for GC
        str = null; // eligible for GC
        System.out.println(str);

        Car car1 = new Car("Toyota");

        car1 = null;
        System.out.println("car1 = " + car1);

        System.out.println("----------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1=new Dog();
        dog1.name="Max";

        System.out.println(dog1);

        String language = "Phyton";
        language="Java";

        System.out.println("--------------");

        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(100);
        ArrayList<Integer> list2 =list1;
        list2.addAll(Arrays.asList(200,300,400));
        System.out.println(list2);// both sharing the same object - only 1 object was created
        System.out.println(list1); // both sharing the same object

        System.out.println("--------------------");

        Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';
        Student student2 = student1;// changes will be made for both students reference names
        student2.name = "Ahmet";

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);

        System.out.println("--------------");

        ArrayList<String> l1= new ArrayList<>();
        l1.add("Java");
        ArrayList<String> l2= new ArrayList<>();
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);


    }
}
