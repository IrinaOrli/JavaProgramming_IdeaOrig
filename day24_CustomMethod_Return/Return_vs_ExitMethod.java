package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {
        nameOfMonth(13);
    }

        public static void nameOfMonth(int monthNumber) {
            String result = "";

            if (monthNumber < 1 || monthNumber > 7) {
                System.out.println("Invalid number");
                return;
            }

            switch (monthNumber) {
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
                default:
                    result = "December";

            }
            System.out.println(result);


    }
}
