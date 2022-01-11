package day35_Encapsulation.encapsilation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();
       Candy c1 = new Candy("aaa", 2, 2.5, true);
        Candy c2 = new Candy("aaa", 2, 5, true);
        Candy c3 = new Candy("aaa", 2, 7, true);
        System.out.println(c1);

        candies.addAll(Arrays.asList(c1,c2,c3));
        for (Candy candy : candies) {
            System.out.println(candy.getPrice());
        }

    }
}
