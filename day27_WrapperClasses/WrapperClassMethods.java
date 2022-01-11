package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";
        int num = Integer.parseInt(str);// int
        System.out.println(num+1);//124
        System.out.println(str+1);//1231

        String str2 = "10.5";
        double num2 = Double.parseDouble(str2);//double
        System.out.println(num2+1);



        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        long max1 = Long.MAX_VALUE;
        long min1 = Long.MIN_VALUE;

        System.out.println("min1 = " + min1);
        System.out.println("max1 = " + max1);


        String s1 = "true";
       boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);

        String s2 = "maybe";
        boolean r2 = Boolean.parseBoolean(s2);

        System.out.println(r2);


        String s3 = "123";
       Integer x= Integer.valueOf(s3);// Integer
        int y= Integer.valueOf(s3);// Integer
        System.out.println("x = " + x);

        String s4 = "1.5";
        Double z = Double.valueOf(s4);//Double

        System.out.println("z = " + z);

        //isDigit()
        char ch1 = '0';
        boolean p2 = Character.isDigit(ch1);
        System.out.println(p2);
        
        //isLetter
        char ch2 = 'A';
        boolean p3 = Character.isLetter(ch2);
        System.out.println(p3);

        // special  char
        char ch3 = '!';
        boolean p4=!Character.isLetterOrDigit(ch3);
        System.out.println("p4 = " + p4);
        
        // upper case
        boolean p5 = Character.isUpperCase(ch2);
        System.out.println("p5 = " + p5);


        // lower case
        boolean p6 = Character.isLowerCase(ch2);
        System.out.println("p6 = " + p6);


        String s = "asas1dsg2fg3dg4";
        int sum = 0;
        for (char each : s.toCharArray()) {
            if (Character.isDigit(each));
            sum+=Integer.parseInt(""+each);
        }


    }
}
