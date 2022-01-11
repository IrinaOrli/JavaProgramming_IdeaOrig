package day31_Constructor.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;
    public int numberOfStars;
    public ArrayList<Server> serversArrayList  = new ArrayList<>();
    public ArrayList<Chef> chefsArrayList  = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;

    }
    public void hireServer(Server server)    {
        serversArrayList.add(server);
    }
    public void hireServer(Server [] serversArray)    {
        serversArrayList.addAll(Arrays.asList(serversArray));
    }
    public void hireChef(Chef chef)    {
        chefsArrayList.add(chef);
    }
    public void hireChef(Chef [] chefsArray)    {
        chefsArrayList.addAll(Arrays.asList(chefsArray));
    }


    public void terminateChef(int ID){
        chefsArrayList.removeIf(chef -> chef.employeeID ==ID);
    }
    public void terminateServer(int ID){
        serversArrayList.removeIf(server -> server.employeeID==ID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", serversArrayList=" + serversArrayList.size() +
                ", chefsArrayList=" + chefsArrayList.size() +
                '}';
    }
}
