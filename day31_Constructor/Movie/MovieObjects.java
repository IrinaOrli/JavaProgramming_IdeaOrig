package day31_Constructor.Movie;

public class MovieObjects {
    public static void main(String[] args) {

        Movie movie1 = new Movie("USA", "Journey to SDET: Cydeo Batch 23","Adventure, Comedy, Thriller", "10/25/2021", "Kuzzat Altay");


        movie1.addCast("Asiya");
        movie1.addCast("Adam");
        movie1.addCast("Muhtar");

        movie1.addCasts( new String[]{"Irina","Alex","Olga", "Svetlana", "Yuri"});


        System.out.println("movie1 = " + movie1);
    }
}
