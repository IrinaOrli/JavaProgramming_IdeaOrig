package day37_Inheritence.PhoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("I12", "6.7 inch", 1000, "Black");

     //   Samsung samsung = new Samsung("")
        System.out.println(iPhone);
        iPhone.call(123456);
        iPhone.text(654321);
        iPhone.faceTime("ddd@sss.com");

    }
}
