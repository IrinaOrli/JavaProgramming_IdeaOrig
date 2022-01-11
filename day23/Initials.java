package day23;

public class Initials {

    public static void main(String[] args) {
        initials("Ira Orli");

        System.out.println("--------------");

       domain("ira.orli@gmail.com");

        System.out.println("--------------");

        month(7);

        System.out.println("--------------");

        dayOfWeek(7);

        System.out.println("--------------");

        daysInMonth("february", 2021);


        String[] emails = {"fdfd@dgdgfd.com", "sfdsf@asdasd.com", "dfjj@adfghh.com"};
        for (String email : emails) {
            domain(email);
        }


    }
    public static void initials( String fullName){

        System.out.println(fullName.substring(0,1).toUpperCase() +"."+ fullName.substring(fullName.indexOf(' ')+1, fullName.indexOf(' ')+2).toUpperCase());
    }
/*Create a method that can display the initials of the person*/

    public static void domain (String email){

        String domainstr = email.substring(email.indexOf('@')+1, email.lastIndexOf('.'));
        System.out.println(domainstr);

    //String [] splitted = email.split("@");
    //String domainPart = splitted[1];
      // System.out.println(domainPart.substring(0, domainPart.indexOf('.')));

    }
    // Create a method that can display the domain of the email


    public static void month (int monthNumber){

        String result = "";
        switch (monthNumber){
            case 1:
               result = "January";
               break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
            default:
                result= "Invalid number";

        }
        System.out.println(result);
    }
    //Create a method that can display the name of the month based on the given number to the method

    public static void dayOfWeek (int weekNumber){
        String result = "";
        switch (weekNumber){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid number";
        }
        System.out.println(result);
}
    //Create a method that can print the name of the day based on the given number to the method

    public static void daysInMonth(String month, int currentYear){

        String result = (month.equalsIgnoreCase("february")&&currentYear%4==0)? "2":
                (month.equalsIgnoreCase("february")&&currentYear%4!=0)? "28":(month.equalsIgnoreCase("april")||
                month.equalsIgnoreCase("june")||month.equalsIgnoreCase("september")||
                month.equalsIgnoreCase("november"))? "30" : (month.equalsIgnoreCase("january")||
                month.equalsIgnoreCase("march")||month.equalsIgnoreCase("may")||
                month.equalsIgnoreCase("july")|| month.equalsIgnoreCase("august")||
                month.equalsIgnoreCase("october")|| month.equalsIgnoreCase("december"))? "31": "Invalid month";
        System.out.println(result);
    }

//Create a method that can print how many days a month has
}




