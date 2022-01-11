package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

    Cars car1 = new Cars();

        car1.brand = "Mercedes";
        car1.model = "DH23KMJ";
        car1.color = "Pink";
        car1.year = 2018;
        car1.price = 10_000;

        System.out.println("car1 = " + car1);

    Cars car2 = new Cars();
    car2.setInfo("Ford","Escape","Blue",2008,5000);

        System.out.println("car2 = " + car2);

        ArrayList<Cars>catList = new ArrayList<>();
        catList.addAll(Arrays.asList(car1,car2));

        for (Cars car : catList) {
            System.out.println(car.brand + ":"+ car.price);
        }

        System.out.println("-------------------------");


        /* eligible for recall
        Mercedes 2005-2018;
        Ford 2000-2008;
         */

        catList.removeIf(p->p.brand.equals("Mercedes")&&p.year>=2005&&p.year<=2018);
        catList.removeIf(p->p.brand.equals("Ford")&&p.year>=2000&&p.year<=2008);



        car1.start();

        car2.stop();

}
}
