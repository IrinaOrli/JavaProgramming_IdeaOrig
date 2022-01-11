package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args) {
        
        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.bread = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.bread = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack","German Shepard", 2, 'M',"Large", "Black");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        Dog dog4 =new Dog();
        dog4.setInfo("Fanya", "None", 8, 'F', "Small", "Black");
        Dog dog5 =new Dog();
        dog5.setInfo("Buttel", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog[]dogs = {dog1, dog2,dog3,dog4,dog5};
        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();

          for (Dog dog : dogs) {
            if (dog.gender=='F'){
                femaleDogs.add(dog);
            }
            if (dog.gender=='M'){
                maleDogs.add(dog);
            }
        }
        int countmaleDogs= maleDogs.size();
        int countfemaleDogs = femaleDogs.size();

        System.out.println("maleDogs = " + maleDogs);
        System.out.println("femaleDogs = " + femaleDogs);

        System.out.println("countmaleDogs = " + countmaleDogs);
        System.out.println("countfemaleDogs = " + countfemaleDogs);
    }
}
