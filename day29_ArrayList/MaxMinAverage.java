package day29_ArrayList;

import java.util.ArrayList;

public class MaxMinAverage {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        int maxNumber =list.get(0);
        int minNumber =list.get(0);
        int sum =0;


        for (Integer integer : list) {

            if (integer>maxNumber){
                maxNumber = integer;
            }
            if (integer<minNumber){
                minNumber = integer;
            }
            sum+=integer;

        }
        double averageNumber = (double) sum/list.size();
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);
        System.out.println("averageNumber = " + averageNumber);
    }
}
