package day36_Inheritance.Animals;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setInfo("Max", "Huski", "white", "small", 'M', 2);

        dog.sleep();
        dog.eat();
        dog.drink();
        dog.move();
        dog.bark();

        System.out.println(dog);

        Cat cat = new Cat();

        cat.setInfo("Tar", "British","black", "medium", 'M', 1);

        cat.sleep();
        cat.eat();
        cat.drink();
        cat.move();
        cat.meow();
        cat.scratch();

        System.out.println(cat);

        Tiger tiger = new Tiger();

        tiger.setInfo("Sher", "Bengal","brown", "large", 'F', 4);

        tiger.sleep();
        tiger.eat();
        tiger.drink();
        tiger.move();
        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);
    }
}
