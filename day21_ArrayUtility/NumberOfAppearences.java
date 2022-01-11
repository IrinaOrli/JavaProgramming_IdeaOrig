package day21_ArrayUtility;

public class NumberOfAppearences {
    public static void main(String[] args) {

        String words = "Java java python ira java word python";
        String [] words1 = words.split(" ");

        int countJava = 0;
        int countPython= 0;

        for (String eachWord : words1) {
            if (eachWord.equalsIgnoreCase("java")){
                countJava++;
            }
            if (eachWord.equalsIgnoreCase("python")){
                countPython++;
            }
        }

        System.out.println(countJava);
        System.out.println(countPython);

    }
}
/*Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
*/