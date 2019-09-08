package me.premaseem.datastructure.graph;


import java.util.LinkedList;

public class Graph {

    int size;
    LinkedList<Integer> vertex[];

    public Graph(int size){
        this.size = size;
        vertex = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            vertex[i] = new LinkedList<>();
        }
    }

    void addEdge(int p1, int p2 ){
        if(p1 > vertex.length || p2 > vertex.length){
            System.out.println("cannot add edge, vertex out of graph");
            return;
        }
        vertex[p1].add(p2);
    }

    public static void main(String[] args) {
        /* Let us take the graph in cyclic order
             0
           /   \
          1     3
         /       \
        2 - - - - 4

       BFS =>  >> 0 >> 1 >> 3 >> 2 >> 4
       DFS =>  >> 4 >> 2 >> 1 >> 3 >> 0

       */

        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.addEdge(2, 4);


        g.BFS(0);
        g.DFS(0);

    }


    void DFS(int v){
        boolean[] visited = new boolean[size];
        DFSR(v,visited);
    }

    void DFSR(int v, boolean[] visited){

        visited[v] = true;

        for (int vert: vertex[v]) {
            if(!visited[vert]){
                DFSR(vert,visited);
            }
        }
        System.out.println(" DFS visiting "+ v);

    }


    void BFS(int v){

        // default marked as false for visited vertex
        boolean[] visited = new boolean[size];

        // form a queue to ensure get first and then connected neighbours
        LinkedList<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;

        while(!q.isEmpty()){
            Integer vert = q.poll();
            System.out.println(" BFS visiting "+vert);

            // getting the adjacent and adding them to q if they not been visited before
            LinkedList<Integer> adj = this.vertex[vert];

            for (Integer vo:adj) {
//                System.out.print(" checking "+vo);
                if(!visited[vo]){
                    visited[vo] = true;
                    q.add(vo);
                }
//                else {
//                    System.out.println(" already visited");
//                }
            }

        }
    }

}
