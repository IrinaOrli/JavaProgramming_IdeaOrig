package day37_Inheritence.AnimalTask;

class A{
    public A(){
        System.out.println("A");
}
}
class B extends A{
    public B(){
        System.out.println("B");
    }
}
public class ConstuctorPractice {
    public static void main(String[] args) {

        B b = new B();
        System.out.println(b);
    }



}
