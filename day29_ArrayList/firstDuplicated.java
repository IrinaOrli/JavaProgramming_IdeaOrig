package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class firstDuplicated {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));



        for (Integer integer : list) {
            int count = 0;
            for (Integer each : list) {
                if (integer==each){
                    count++;
                }

                }
                if (count>1){
                    System.out.println(integer);
                    break;
            }

        }

    }
}
/*Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
* */