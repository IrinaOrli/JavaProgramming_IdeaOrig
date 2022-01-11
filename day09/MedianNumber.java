package day09;

public class MedianNumber {
    public static void main(String[] args) {
/*Create a class called MedianNumber. write a program that can find the median number
between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
                */
      /*  int a = 10, b= 17, c = 50;
        int MedianNumber = (a + b +c)/3;

        System.out.println(MedianNumber + " is the median number");
*/

       int a = 17, b= 15, c = 16;
       boolean aIsMedian = (a >b && a< c) || (a<b && a>c);
       boolean bIsMedian = (b >a && b< c) || (b<a && b>c);
       boolean cIsMediam = !aIsMedian&&!bIsMedian; //(c >b && c< a) || (c <b && c>a);

       if (aIsMedian){
           System.out.println(a + " is the median number");
       }
       if (bIsMedian){
           System.out.println(b + " is the median number");
       }
       if (cIsMediam){
           System.out.println(c + " is the median number");
       }

    }
}
