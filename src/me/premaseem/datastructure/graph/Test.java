package me.premaseem.datastructure.graph;

public class Test {

    @org.junit.Test
    public void testGraph(){
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,5);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,5);

        graph.getAdjecents(0);
        graph.printGraphEdges();
    }

    @org.junit.Test
    public void testBusRoutes(){
        BusRoute myGraph = new BusRoute(5,"directed");

        myGraph.addVertex("State");
        myGraph.addVertex("Avenel");
        myGraph.addVertex("Elm");
        myGraph.addVertex("Pocono");
        myGraph.addVertex("William");

        myGraph.addRoute("State", "Avenel");
        myGraph.addRoute("State", "Elm");
        myGraph.addRoute("State", "Pocono");
        myGraph.addRoute("Avenel", "Pocono");
        myGraph.addRoute("Elm", "Avenel");
        myGraph.addRoute("Elm", "William");
        myGraph.addRoute("William", "State");
        myGraph.addRoute("William", "Pocono");
        myGraph.addRoute("Pocono", "Elm");

        myGraph.printRoutes();
    }


}
