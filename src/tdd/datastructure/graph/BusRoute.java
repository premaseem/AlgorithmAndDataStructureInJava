package tdd.datastructure.graph;

public class BusRoute {

    Vertex[] arrayOfLists;
    int indexCounter = 0;
    boolean undirected = true;

    class Node {
        public int vertexIdx;
        public Node next;

        public Node(int vertexIdx, Node node) {
            this.vertexIdx = vertexIdx;
            next = node;
        }
    }

    class Vertex {
        String name;
        Node adjList;

        Vertex(String name, Node aNode) {
            this.name = name;
            this.adjList = aNode;
        }
    }

    public BusRoute(int vCount, String graphType) {

        if (graphType.equals("directed")) {
            undirected = false;
        }

        arrayOfLists = new Vertex[vCount];
    }

    public void addVertex(String vertexName) {
        arrayOfLists[indexCounter] = new Vertex(vertexName, null);
        indexCounter++;
    }

    public void addRoute(String srcVertexName, String destVertexName) {
        int v1Idx = indexForName(srcVertexName);
        int v2Idx = indexForName(destVertexName);
        arrayOfLists[v1Idx].adjList = new Node(v2Idx, arrayOfLists[v1Idx].adjList);
        if (undirected) {
            arrayOfLists[v2Idx].adjList = new Node(v1Idx, arrayOfLists[v2Idx].adjList);
        }
    }

    int indexForName(String name) {
        for (int v = 0; v < arrayOfLists.length; v++) {
            if (arrayOfLists[v].name.equals(name)) {
                return v;
            }
        }
        return -1;
    }

    public void printRoutes() {
        System.out.println();
        for (int v = 0; v < arrayOfLists.length; v++) {
            System.out.print(arrayOfLists[v].name);
            for (Node aNode = arrayOfLists[v].adjList; aNode != null; aNode = aNode.next) {
                System.out.print(" --> " + arrayOfLists[aNode.vertexIdx].name);
            }
            System.out.println("\n");
        }
    }
}


