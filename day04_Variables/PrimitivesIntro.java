package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {

        //age: 38 years old

        byte age=38;

        //weigh: 160 pounds
        //byte weight = 160; // compiler error - 160 is out of byte's range
        // byte num = -129: // compiler error - 160 is out of byte's range

        short weight = 160; // 160 is within the range of short

        // salary 1000000 $; // 1000000 is out of short's range
        //  to separate 0000000 use_  : 1000_000_000

        int salary = 100_000; // int is the preferred data type of integer numbers

        long assets = 3_333_333_333L;

        //tax: 0.26
        float tax = 0.26F;

        double PI = 3.14;




    }
}
