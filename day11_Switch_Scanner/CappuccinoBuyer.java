package day11_Switch_Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        /*Create a class called  CappuccinoBuyer. A variable named Size is given, write a
        program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed*/

        double price = 0;
        int calories = 0;
        String size = "venti";
        if (size == "tall" || size == "grande" || size == "venti") {
            if (size == "tall") {
                price = 3.69;
                calories = 90;
            } else if (size == "grande") {
                price = 3.99;
                calories = 120;
            } else {
                price = 4.29;
                calories = 150;
            }
            System.out.println(size + "\nprice is $" + price + "\n" + calories + " calories ");
        }else {
            System.out.println("Invalid Size");
        }
        System.out.println("-----------------------------------------");

        String result="";
        switch (size){
            case "tall":
                result ="price is $3.69\n" + "90 calories";
            break;
            case "grande":
                result = "price is $3.99\n" + "120 calories";
            break;
            case "venti":
                result = "price is $4.29\n" + "150 calories";
            break;
            default:
                result = "Invalid Size";
        }
        System.out.println(result);

        System.out.println("==========================");

        if (size == "tall" || size == "grande" || size == "venti") {
        switch (size) {
            case "tall":
                result = "price is $3.69\n" + "90 calories";
                break;
            case "grande":
                result = "price is $3.99\n" + "120 calories";
                break;
            default:
                result = "price is $4.29\n" + "150 calories";
        }
        }else {
                result = "Invalid Size";
        }
        System.out.println(result);
    }

}