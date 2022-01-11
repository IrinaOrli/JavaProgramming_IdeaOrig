package day31_Constructor.Restaurant;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant Astoria = new Restaurant("Esenin", "St.Petersburg",5);
        //ArrayList<Server> servers = new ArrayList<>();
       // ArrayList<Chef> chefs = new ArrayList<>();

        Server server1 =new Server("aaa",12345,12,true);
        Server server2 =new Server("bbb",23456,13,true);
        Server server3 =new Server("ccc",34567,10,false);

        Server[] arrayOfServers ={server2,server3};

        Chef chef1 = new Chef("ddd", 56789,20,false);
        Chef chef2 = new Chef("eee", 6789,25,true);

        Chef[] arrayOfChiefs ={chef1,chef1};

        Astoria.hireServer(server1);
        Astoria.hireServer(arrayOfServers);

        Astoria.hireChef(arrayOfChiefs);

        System.out.println(Astoria);
    }
}
