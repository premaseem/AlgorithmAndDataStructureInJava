package dsGuy.bfs;

import java.util.ArrayList;

import dsGuy.node.*;

public class PathFindingByBFSMain {

	public static void main(String[] args) {
		
		ArrayList<GraphNode> nodeList = new ArrayList<>();
				
		//create 10 nodes: v1-v10
		for(int i=0;i<10; i++) {
			nodeList.add(new GraphNode(""+i));
		}
		
		//Constructor
		PathFindingByBFS graph = new PathFindingByBFS(nodeList);
		//add edges following graph in graph.docx
		graph.addUndirectedEdge(0,8);
		graph.addUndirectedEdge(8,2);
		graph.addUndirectedEdge(8,9);
		graph.addUndirectedEdge(2,1);
		graph.addUndirectedEdge(9,1);
		graph.addUndirectedEdge(2,4);
		graph.addUndirectedEdge(1,3);
		graph.addUndirectedEdge(1,7);
		graph.addUndirectedEdge(3,4);
		graph.addUndirectedEdge(3,5);
		graph.addUndirectedEdge(7,6);
		graph.addUndirectedEdge(5,6);
		
		System.out.println("Printing BFS from source: 2");
		graph.BFSForSSSP(nodeList.get(2));
	}//end of method

}//end of class
