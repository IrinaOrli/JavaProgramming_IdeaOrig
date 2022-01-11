package day24_CustomMethod_Return;

public class ReturnStatement {

    public static void main(String[] args) {
nameOfDay(8);
    }

    public static void nameOfDay(int number){
    if (number<1||number>7){
    return;// exits the method

}
    if (number ==1){
        System.out.println("Mond");
    } else if (number ==1){
        System.out.println("Tue");
    }else if (number ==1){
        System.out.println("Wedn");
    }else if (number ==1){
        System.out.println("Thur");
    }else if (number ==1) {
        System.out.println("Fri");
    }else if (number ==1){
        System.out.println("Sat");
    }   else {
        System.out.println("Sund");
    }
    }







}
