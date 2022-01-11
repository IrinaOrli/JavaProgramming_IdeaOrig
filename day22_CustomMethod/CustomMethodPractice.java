package day22_CustomMethod;

public class CustomMethodPractice {
    public static void main(String[] args) {
        displayHelloWorld();
        System.out.println("-----------");
        displayHelloCydeo();
        System.out.println("-----------");
        allEven();
    }

    public static void displayHelloWorld() {
        System.out.println("Hello World!\n".repeat(5));

    }

    public static void displayHelloCydeo() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");

        }
    }

    public static void allEven() {

        for (int i = 2; i <= 10; i+=2) {

                System.out.println(i);
            }

        }
    }
