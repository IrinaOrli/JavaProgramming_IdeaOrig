package day37_Inheritence.AnimalTask;

public class Dog extends Animal {

        private int a;
    public Dog(String name, String breed, String color, String size, char gender, int age, int a){
        super(name, breed,  color,  size,  gender,  age);
        this.a= a;
    }
    public void bark(){
        System.out.println(name+" is barking");

}

}
