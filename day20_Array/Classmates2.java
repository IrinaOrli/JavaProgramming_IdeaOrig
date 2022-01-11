package day20_Array;

import java.util.Arrays;

public class Classmates2 {
    public static void main(String[] args) {
        String[]classmates = {"Ira", "Vika", "Sasha", "Yura", "Sveta", "July", "Zhenya", "Igor", "Galya","Lesha"};



        for (int j = 0; j < classmates.length; j++) {
            String eachName = classmates[j];
            String result = "";
        for (int i = eachName.length()-1; i >=0; i--) {
            String eachLetter= eachName.charAt(i)+"";
            result+=eachLetter + "";
        }
            System.out.println(result);
    }
        System.out.println("------------");

       for (String each:classmates) {
           String reversed1 = "";
           for (int i = each.length()-1; i >=0 ; i--) {
               reversed1+=each.charAt(i);

           }
           System.out.println(reversed1);
       }

}




}
/*create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c*/