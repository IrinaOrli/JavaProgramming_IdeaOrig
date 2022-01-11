package Day14_String;

public class StringMethod1 {

    public static void main(String[] args) {

        String str1="     bath 25   ";
        str1= str1.trim();
        System.out.println(str1);

        String str2= "Cydeo School";

        int n1=str2.indexOf("h");
        System.out.println("n1=" + n1);

        int n2= str2.indexOf("ool");
        System.out.println("n2= "+n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("a ");

        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("g");

        System.out.println("n4 = " + n4);


        String s = "Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        // int forthA =s.indexOf ("ava W")  or:
        //int forthA = s.lastIndexOf("ava");
        int forthA = s.indexOf("Ca") + 1;

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("forthA = " + forthA);
        

    }}
