package day31_Constructor;

public class Item {

   public String name;
   public double unitPrice;
   public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
    double totalPrice = unitPrice*quantity;
        return totalPrice;
    }

    public String toString() {
        return "item{" +
                "name='" + name + '\'' +
                ", unitPrice= $" + unitPrice +
                ", quantity=" + quantity +
                ", total Price= $" + calcCost() +
                '}';
    }

}
