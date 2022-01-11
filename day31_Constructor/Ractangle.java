package day31_Constructor;

public class Ractangle {

    public double  length, width;


    public Ractangle(double length, double width) {
        this.length = length;
        this.width = width;

    }
    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return 2*(length+width);
    }


    public String toString() {
        return "Ractangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }
}


/*create a custom class named Rectangle
    Attributes:
        length, width

    Add a constructor that can set all the fields

    Actions:
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
         toString(): displays the width, length, area and perimeter of the rectangle when an object of rectangle passed in the print statement*/