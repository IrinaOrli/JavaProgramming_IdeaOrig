package day21_MultiDimansionalArray;

public class Fruit {
    public static void main(String[] args) {



        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String[] eachArray : items) {
            for (String echItem : eachArray) {
                System.out.print("\t"+echItem);
            }
            System.out.println();
        }

        System.out.println("-------------");
        for (String[] eachArray : items) {
            for (int i = eachArray.length - 1; i >= 0; i--) {
                System.out.print("\t"+eachArray[i]);
            }
            System.out.println();
            }



        System.out.println("==================");
        for (int i = items.length - 1; i >= 0; i--) {
            String[] eachArray = items[i];
            for (String echItem : eachArray) {
                System.out.print("\t"+echItem);
        }
            System.out.println();
            }


    }
}
/*Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
*/