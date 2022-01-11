package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElement2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,5,5,7,8,9,9));
        
        ArrayList<Integer> unique = new ArrayList<>(list); //add all elements of original array in order to delete duplicates from it
        
        unique.removeIf(p-> Collections.frequency(list,p)>1);

        System.out.println("unique = " + unique);
    }
}
