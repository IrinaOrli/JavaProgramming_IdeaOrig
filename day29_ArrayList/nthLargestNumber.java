package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nthLargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(101,12,3,7,4,5,16,16,16,7,8,89));
        int n=3;

        ArrayList<Integer> result = new ArrayList<>(list);

         for (int i = 1; i < n; i++) {
            result.remove(Collections.max(result));
           }
        System.out.println(Collections.max(result));

        // list.removeIf(p-> Collections.max(list)==p);
       //  int max = Collections.max(list);

        }

    }

