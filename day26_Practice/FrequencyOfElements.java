package day26_Practice;



public class FrequencyOfElements {
    public static void main(String[]args){
        int [] array = {1,2,3,4,5,1,1,1,1,1,1};
       int number = 1;
        System.out.println(FrequencyOfElements(array,number));

}
    public static int FrequencyOfElements (int [] array, int number){

        int count = 0;
        for (int each : array) {
            if (each==number){
                count++;
            }
        }
        return count;
    }
    public static int FrequencyOfElements (double [] array, double number){

        int count = 0;
        for (double each : array) {
            if (each==number){
                count++;
            }
        }
        return count;
    }
    public static int FrequencyOfElements (char [] array, char element){

        int count = 0;
        for (char each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }
    public static int FrequencyOfElements (String [] array, String element){

        int count = 0;
        for (String each : array) {
            if (each.equals(element)){
                count++;
            }
        }
        return count;
    }
}
