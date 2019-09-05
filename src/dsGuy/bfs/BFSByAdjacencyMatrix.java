package dsGuy.bfs;
import java.util.ArrayList;
import java.util.LinkedList;
import dsGuy.node.*;

public class BFSByAdjacencyMatrix {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	int [][] adjacencyMatrix;

	
	//Constructor
	public BFSByAdjacencyMatrix(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
		adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
	}
	
	
	//BFS Algorithm
	void bfs() {
		for(GraphNode node: nodeList) { //if a node is unvisited then run bfs on it
			if(!node.isVisited())
				bfsVisit(node);
		}
	}
	
	
	//BFS internal method
	void bfsVisit(GraphNode node) {
		LinkedList<GraphNode>queue = new LinkedList<>();
		queue.add(node); //add source node to queue
		while(!queue.isEmpty()) {
			GraphNode presentNode = queue.remove(0);
			presentNode.setVisited(true);
			System.out.print(presentNode.getName()+" ");
			
			ArrayList<GraphNode> neighbors = getNeighbors(presentNode);
			for(GraphNode neighbor: neighbors) { 	//for each neighbor of present node
				if(!neighbor.isVisited()) {
					queue.add(neighbor);
					neighbor.setVisited(true);
				}
			}//end of for loop
		}//end of while loop
	}//end of method
	
	
	
	// get all neighbors of a particular node by checking adjacency matrix and add it to neighbours arraylist
	public  ArrayList<GraphNode> getNeighbors(GraphNode node) {
		ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();
		
		//gets row# to search in node index
		int nodeIndex = node.getIndex();
	
		for(int i=0; i<adjacencyMatrix.length;i++) {
			//if a column has 1 in that row then there is a neighbor and add it to list
			if(adjacencyMatrix[nodeIndex][i]==1) {
				neighbors.add(nodeList.get(i));
			}
		}
		return neighbors;
	}
	
	
	// add an undirected edge between two nodes
	public void addUndirectedEdge(int i, int j) {
		//decrement i, j for array indexes
		i--;
		j--;
		adjacencyMatrix[i][j] = 1;
		adjacencyMatrix[j][i] = 1;
		
	}
}
