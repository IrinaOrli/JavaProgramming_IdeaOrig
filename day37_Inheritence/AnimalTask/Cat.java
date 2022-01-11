package day37_Inheritence.AnimalTask;

public class Cat extends Animal {

    public Cat (String name, String color, String breed, String size, char gender,int age){
        super(name,breed,color,size,gender,age);
    }
    public void scratch(){
        System.out.println(name+"is scratching");
    }


}
