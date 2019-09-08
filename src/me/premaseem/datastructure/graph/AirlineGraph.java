package me.premaseem.datastructure.graph;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class City {
    int index;
    String name;
    String code;
    LinkedList<City> connectedCity = new LinkedList<>();

    public City(int i, String name, String code) {
        index = i;
        this.name = name;
        this.code = code;
    }
}

public class AirlineGraph {

    int size =0;
    List<City> cities = new ArrayList<>();

    void addCity(String code, String name){
        int i = size++;
        City city = new City(i,name, code);
        cities.add(city);
    }

    City cityLookup(String code){
        for(City c:cities){
            if(c.code.equalsIgnoreCase(code)){
                return c;
            }
        }
        return null;
    }

    void connectCity(String code1, String code2){
        City c1 = cityLookup(code1);
        City c2 = cityLookup(code2);
        if( c1 == null || c2 == null){
            System.out.println("Cannot connect, Invalid city code.");
            return;
        }
        c1.connectedCity.add(c2);
    }


    public static void main(String[] args) {

        AirlineGraph g = new AirlineGraph();

        // Add vertex or cities in the air line graph
        g.addCity("SFO","San Fransisco");
        g.addCity("AUS","Austin");
        g.addCity("NY","New york");
        g.addCity("BOM","Mumbai");
        g.addCity("IND","Indore");
        g.addCity("DEW","Dewas");

        // Add edges or air ways in the graph
        g.connectCity("DEW","IND");
        g.connectCity("IND", "BOM");
        g.connectCity("BOM","NY");
        g.connectCity("BOM","SFO");
        g.connectCity("NY", "AUS");
        g.connectCity("NY", "SFO");
        g.connectCity("NY", "BOM");

        // DFS to find path
        g.findDFSpath("DEW");
        g.findDFSpath("NY");

        // BFS to find path
        g.findBFSpath("DEW");
        g.findBFSpath("NY");


    }


    private void findBFSpath(String code) {
        boolean[] visited = new boolean[size];
        City city = cityLookup(code);
        System.out.println("\n printing BFS path from city "+ city.name);
        LinkedList<City> q = new LinkedList<>();
        q.add(city);
        visited[city.index] = true;

        while(!q.isEmpty()){
            City currentCity = q.poll();
            System.out.print(" >> "+ currentCity.name);


            for(City cc:currentCity.connectedCity){
                if(!visited[cc.index]){
                    visited[cc.index] = true;
                    q.add(cc);
                }
            }


        }

    }

    private void findDFSpath(String code) {
        boolean[] visited = new boolean[size];
        City city = cityLookup(code);
        System.out.println("printing DFS path from city "+ city.name);
        DFS(city, visited);
    }

    private void DFS(City city, boolean[] visited) {
        visited[city.index] = true;
        for(City c :city.connectedCity){
            if(!visited[c.index]){
                DFS(c,visited);
            }
        }
        System.out.println(" >> "+city.name);
    }


}
