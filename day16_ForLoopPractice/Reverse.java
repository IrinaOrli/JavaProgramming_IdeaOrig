package day16_ForLoopPractice;

public class Reverse {

    public static void main(String[] args) {
    String str ="Wooden Spoon";
    String result = ""; // contain the reverse version of str
//index: 0123456...
        //result+= str.charAt(str.length()-1);//n
        // result+= str.charAt(11);//n
        // result+= str.charAt(10);//0
        // result+= str.charAt(9);//0
        // result+= str.charAt(8);//p ......

        for (int i = str.length()-1; i >=0 ; i--) {
            result+= str.charAt(i);//adding each character to the result
        }
        System.out.println(result);







    }


}
