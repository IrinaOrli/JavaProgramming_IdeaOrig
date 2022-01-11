package day37_Inheritence.AnimalTask;

public class AnimalObjs {
    public static void main(String[] args) {
        Cat cat = new Cat("a", "b", "c", "d", 'M', 3);
        System.out.println(cat);
        cat.scratch();

        Dog dog = new Dog("Alex", "Husky", "white", "big", 'F', 5, 0);
        System.out.println(dog);
        dog.bark();

        Parrot parrot = new Parrot("King", "Macaw", "blue", "small", 'M', 3);
        System.out.println(parrot);
    }

}
