package day21_ArrayUtility;

public class ForEachLoopPractice_Unique {
    public static void main(String[] args) {


        String[] words = {"Java", "Python", "Olga", "Adam", "Cydeo", "Cydeo" };

        for (String each : words) {
            int frequency =0;
            for (String word : words) {

                if (each.equals(word)){
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.println(each);

            }

        }



    }
}
