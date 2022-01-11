package day33_Statics;

public class IPhone {
    public static String brand = "Apple";
    public String model;
    public double price;
    public static String OS = "iOS";
    public String color;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean hasFaceTime = true;

    public static void printModelAndPrice() {
        // System.out.println(model + " " price);// no way for instance variables in static method
    }

    public void method1() {
        System.out.println(model + ": " + price);
        System.out.println(OS);
    }

    public static void printOperSystem() {
        System.out.println(OS);

    }
}