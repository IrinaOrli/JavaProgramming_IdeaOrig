package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {
    public static void main(String[] args) {

        Pizza order1 = new Pizza('M',2,2);
        System.out.println(order1);

        ArrayList<Pizza> pizzas = new ArrayList<>();

        /*
        for (int i = 0; i < 100; i++) {
            pizzas.add(new Pizza('S',2,3));
        }
        for (int i = 0; i < 100; i++) {
            pizzas.add(new Pizza('M',3,4));
        }
        for (int i = 0; i < 100; i++) {
            pizzas.add(new Pizza('L',4,5));
        }
        System.out.println(pizzas.size());

         */
        for (int i = 0; i < 100; i++) {
            Pizza smallPizza = new Pizza('S',2,3);
            Pizza mediumPizza = new Pizza('M',3,4);
            Pizza largePizza = new Pizza('L',4,5);

            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));
        }
        System.out.println("Total number of pizzas: "+pizzas.size());
        double totalPrice =0;

        for (Pizza pizza : pizzas) {
            totalPrice+=pizza.calcCost();
        }
        System.out.println("totalPrice = $" + totalPrice);
    }

}
