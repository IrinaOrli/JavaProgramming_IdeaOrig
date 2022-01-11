package day04_Variables;

public class Square {
    public static void main(String[] args) {

        /*
        * 1. Create a class named Square, write a program that can calculate the area & perimeter of any given square
                        side

                        area = side * side;
                        perimeter = 4 * side
 */
        double Side = 3.5;
        double Area = Side * Side;
        double Perimeter = 4 * Side;

        System.out.println("Side = " + Side);
        System.out.println(Area);
        System.out.println("Perimeter = " + Perimeter);
    }


}
