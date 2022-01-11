import java.util.ArrayList;

public class DogTask_FORDISCORD {


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
        System.out.println(name + " is eating");
    }
    public void bark (){
        System.out.println(name + " is barking");
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
class DogObjects {

    public static void main(String[] args) {

        day30_CustomClass.Dog dog1 = new day30_CustomClass.Dog();
        dog1.name = "Lucy";
        dog1.bread = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        day30_CustomClass.Dog dog2 = new day30_CustomClass.Dog();
        dog2.name = "ACE";
        dog2.bread = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        day30_CustomClass.Dog dog3 = new day30_CustomClass.Dog();
        dog3.setInfo("Jack","German Shepard", 2, 'M',"Large", "Black");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        day30_CustomClass.Dog dog4 =new day30_CustomClass.Dog();
        dog4.setInfo("Fanya", "None", 8, 'F', "Small", "Black");
        day30_CustomClass.Dog dog5 =new day30_CustomClass.Dog();
        dog5.setInfo("Buttel", "Labrador", 3, 'M', "Extra Large", "Yellow");

        day30_CustomClass.Dog[]dogs = {dog1, dog2,dog3,dog4,dog5};
        ArrayList<day30_CustomClass.Dog> femaleDogs = new ArrayList<>();
        ArrayList<day30_CustomClass.Dog> maleDogs = new ArrayList<>();

        for (day30_CustomClass.Dog dog : dogs) {
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
