package day34_GarbageCollection_AccessModifier;

public class AccessModifiersTest {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
        //System.out.println(AccessModifiers.privateData);//private not visible outside the class

    AccessModifiers.method1();
    AccessModifiers.method2();
    //AccessModifiers.method3(); // private not visible outside the class





    }


}
