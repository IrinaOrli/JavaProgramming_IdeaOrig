package day17_WhileLoop;
public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "Java Java Python";
        int frequency =0;

        while (str.contains("Java")){
           str= str.replaceFirst("Java","");
            frequency++;

        }
        System.out.println(frequency);

        System.out.println("--------------------");

        String sentence = "cat dog cat cat cat";
        int frequencyCat =0;
        sentence = sentence.toLowerCase();

        while (sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat","");
            frequencyCat++;

        }
        System.out.println(frequencyCat);
        System.out.println(sentence);

        System.out.println("----------------------------------------");

        String s = "java java java python python python";

        int countJava =0;
        int countPython = 0;

        while(s.contains("java") || s.contains("python")){

            if(s.contains("java")){
                s = s.replaceFirst("java", "");
                countJava++;
            }

            if(s.contains("python")){
                s = s.replaceFirst("python", "");
                countPython++;
            }

        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);


    }
}
