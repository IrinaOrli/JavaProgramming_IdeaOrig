package day24_CustomMethod_Return;

import java.util.Locale;

public class Practice {
    public static void main(String[] args) {


    }
    /*create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3*/
    public static int frequencyOfWord (String sentence, String word){
        int count = 0;
        sentence = sentence.toLowerCase();
        String [] sentenceArray = sentence.split(" ");
        for (String each : sentenceArray) {
            if (each.contains(word)){
                count++;
        }
        }
        return count;
    }





}
