package tdd.datastructure.graph;

import java.util.ArrayList;

public class Graph {

    ArrayList graphArray[];

    public Graph(int numOfVertices) {
        graphArray = new ArrayList[numOfVertices];
        for (int i = 0; i < graphArray.length; i++) {
            graphArray[i] = new ArrayList<Integer>();
        }

    }

    public void addEdge(int from, int to) {
        graphArray[from].add(to);
    }

    public void getAdjecents(int vertex) {
        ArrayList edges = graphArray[vertex];
        for (Object i : edges) {
            System.out.printf(" %s --> %s \n", vertex, i);
        }
    }

    public void printGraphEdges() {
        for (int i = 0; i < graphArray.length; i++) {
            for (Object obj : graphArray[i]) {
                System.out.printf(" %s --> %s \n", i, obj);
            }
        }

    }
}
