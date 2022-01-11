package day30_CustomClass;

public class Dog {

    public String name;
    public int age;
    public char gender;
    public String bread;
    public String size;
    public String color;

    public void setInfo (String dogName, String dogBread, int dogAge, char dogGender, String dogSize, String dogColor){
       name = dogName;
       age =dogAge;
       gender =dogGender;
       bread =dogBread;
       size =dogSize;
       color =dogColor;
    }

    public void eat (){
        System.out.println(name + "is eating");
    }
    public void bark (){
        System.out.println(name + "is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", bread='" + bread + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}



/* Attributes:
name, age, gender, bread, size, color

Actions:
eat(), play (), bark()....



 */