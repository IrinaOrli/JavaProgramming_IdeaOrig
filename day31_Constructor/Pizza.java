package day31_Constructor;

public class Pizza {

    char size;
    int numberOfCheeseTopping, numberOfPepperoniTopping;


    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;

    }


    public double calcCost(){

        double baseCost =0;
        if (size=='S'){
            baseCost =10;
        }
        else if (size=='M'){
            baseCost =12;
        }else {
            baseCost =14;
        }
        double totalCost=baseCost+(2*numberOfCheeseTopping)+(2*numberOfPepperoniTopping);
        return totalCost;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost= $" + calcCost() +
                '}';
    }

}
