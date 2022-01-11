package day05_Concatination;

public class ShippingAddress {
    public static void main(String[] args) {

        /*Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address
James King
11821B Jones Branch Dr
McLean, VA 22031A
*/

        String name = "Irina Orlova",
                buildingNumber = "9315",
                streetName = "Otter Creek Dr",
                cityName = "Charlotte",
                state = "NC",
                zipCode = "28277";


        String address = name + "\n" + buildingNumber + " " + streetName + "\n" +
                cityName + ", " + state + " " + zipCode;

        System.out.println(address);


        /*System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" +
                cityName + ", " + state + " " + zipCode);*/

    }
}
