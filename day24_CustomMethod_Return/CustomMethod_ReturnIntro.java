package day24_CustomMethod_Return;

public class CustomMethod_ReturnIntro {


    public static String reverse (String str){

String reverse = "";
        for (int i = str.length()-1; i >=0; i--) {
        reverse += str.charAt(i);
        }
        return reverse;


}
    public static void main(String[] args) {
        String str = "Java";
       String result = reverse(str);
        System.out.println(result);

        if (str.equalsIgnoreCase(result)){
            System.out.println(str + " is palindrome");
        }else {
            System.out.println(str + " is not a palindrome");
        }

    }


}
