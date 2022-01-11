package day10_NestedIf;

public class CrewAndPassenger {
    public static void main(String[] args) {
        /*Create a class called CrewAndPassanger, Given a number of people on the ship (int number), determine how many
         need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT*/

        int totalPassengers = 100;
        String crewAndPassengers ="";

        if (totalPassengers ==50||totalPassengers==75 || totalPassengers==100) {
            if (totalPassengers == 50) {
                crewAndPassengers = "20 crew, 30 passengers";
            } else if (totalPassengers == 75) {
                crewAndPassengers = "25 crew, 50 passengers";
            } else {
                crewAndPassengers = "30 crew, 70 passengers";
            }
        } else {
            crewAndPassengers = "The number of people on the ship is not valid.";
        }
        System.out.println(crewAndPassengers);
    }
}
