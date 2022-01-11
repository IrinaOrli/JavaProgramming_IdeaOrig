package day20_Array;

public class AppearedTwice {
    public static void main(String[] args) {

        String[] words = {"Java","olga", "Olga", "Python", "Olga", "Adam", "Cydeo", "Cydeo"};

        String result = "";

        for (int j = 0; j < words.length; j++) {
            String element = words[j];

            int frequency = 0;

            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)) {
                    frequency++;
                }
            }
            if (frequency == 2) {
                if (result.contains(element)){
                    continue;
                }
                result+= element+" ";

                }

    }
        System.out.println(result);

        }

        }



