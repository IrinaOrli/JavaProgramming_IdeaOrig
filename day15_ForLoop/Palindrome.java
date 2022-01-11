package day15_ForLoop;

public class Palindrome {
    public static void main(String[] args) {
        String str = "iri";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }    if (str.equalsIgnoreCase(reversed)) {
                System.out.println("palindrome");
            }else {
                System.out.println("is not a palindrome");
            }

        }

    }

