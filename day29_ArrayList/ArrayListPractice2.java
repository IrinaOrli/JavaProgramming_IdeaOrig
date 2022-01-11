package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel","Aaron"));

       employees.retainAll(Arrays.asList("David","Ahmed"));
        System.out.println(employees);

        System.out.println("-----------------");
        
        String[] names = {"Mary", "Monica","Mehray","Musti","Sumeyra", "Hasan"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        
        list.removeIf(p-> p.startsWith("M")); // p.chatAt(0) == 'M'
        names = list.toArray(new String [0]);

        System.out.println(Arrays.toString(names));

        }
    }

