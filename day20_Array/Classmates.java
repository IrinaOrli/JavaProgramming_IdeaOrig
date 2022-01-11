package day20_Array;

public class Classmates {
    public static void main(String[] args) {

        String[]classmates = {"Ira Or", "Vika Ma", "Sasha Ma", "Yura Ba", "Sveta Ba", "July Po", "Zhenya Ne", "Igor Om", "Galya Om","Lesha Om"};


        for (int i = 0; i < classmates.length; i++) {
            String firstName =  classmates[i].substring(0,1);
            String lastName = classmates[i].substring(classmates[i].indexOf(" ")+1,classmates[i].indexOf(" ")+2);
            String initial = firstName + "." + lastName+".\n";
            System.out.print(initial);
        }
        System.out.println("--------------");

        for (String classmate : classmates) {

            String initial = classmate.charAt(0)+"."+classmate.charAt(classmate.indexOf(" ")+1);
            System.out.println(initial);

        }


    }
}
/* create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines*/