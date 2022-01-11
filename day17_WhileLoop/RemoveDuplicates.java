package day17_WhileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AABBCCCCCD";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String letter = ""+str.charAt(i);
            if (result.contains(letter)){
                continue;
            }
                result+=letter;
            }

        System.out.println(result);




    }
}
