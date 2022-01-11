package day37_Inheritence.PhoneTask;

public class IPhone extends Phone {


    public IPhone(String model, String size, double price, String color) {
        super("Apple", model, size, price,color);


    }
    public void faceTime(long phoneNumber){
        System.out.println(brand +" is face timing" + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand +" is face timing" + email);
    }

}
