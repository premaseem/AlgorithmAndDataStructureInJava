package tdd.datastructure.graph;

public class Test {

    @org.junit.Test
    public void test(){
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

}
