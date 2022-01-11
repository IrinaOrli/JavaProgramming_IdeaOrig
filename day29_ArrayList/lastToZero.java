package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lastToZero {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
         list.addAll(Arrays.asList(1,2,3,4,5));
         list.set(list.size()-1,0);
        System.out.println(list);

    }
}
/*write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];*/