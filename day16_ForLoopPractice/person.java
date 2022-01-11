package day16_ForLoopPractice;

public class person {
    public static void main(String[] args) {

    String person = "jon,doe,30";
     String [] arr = person.split(",");

        System.out.println("person name: "+ arr[0]);
        System.out.println("last name: "+ arr[1]);
        System.out.println("age: "+ arr[2]);
    }
}
