package day29_ArrayList;

import java.util.ArrayList;

public class day29_UniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(50);

        int uniqueElement = 0;

        for (Integer number : numbers) {
            int count = 0;
            for (Integer integer : numbers) {
                if (number == integer) {
                    count++;
                }
            }
                if (count == 1) {
                    uniqueElement = number;
                    break;
                }
            }
            System.out.println(uniqueElement);
        }
    }

