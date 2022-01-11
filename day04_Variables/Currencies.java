package day04_Variables;

public class Currencies {
    public static void main(String[] args) {

        int dollar = 1000;
        double liraRate = 9.55;
        double euroRate = 0.86;
        double rubleRate =71.58;
        double frankRate = 0.91;
        double rupeeRate = 74.85;
        double yenRate = 113.95;
        double kronaRate = 8.52;


        double liraTotal = dollar * liraRate;
        double euroTotal = dollar * euroRate;
        double frankTotal = dollar * frankRate;
        double rubleTotal = dollar * rubleRate;
        double rupeeTotal= dollar* rupeeRate;
        double yenTotal = dollar * yenRate;
        double kronaTotal = dollar * kronaRate;

        System.out.println("dollar = " + dollar);
        System.out.println("liraTotal = " + liraTotal);
        System.out.println("euroTotal = " + euroTotal);
        System.out.println("rubleTotal = " + rubleTotal);
        System.out.println("frankTotal = " + frankTotal);
        System.out.println("rupeeTotal = " + rupeeTotal);
        System.out.println("yenTotal = " + yenTotal);
        System.out.println("kronaTotal = " + kronaTotal);


    }
}
