package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class swapFirstLast {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        int temp = list.get(list.size()-1);
        list.set(list.size()-1,list.get(0) );
        list.set(0,temp);


        System.out.println(list);

    }

}
/*write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];*/