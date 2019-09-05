package dsGuy.heap;

public class HeapByArrayMain {

	public static void main(String[] args) {
		System.out.println("Creating a blank Heap");
		HeapByArray heap = new HeapByArray(10);
		
		heap.insertInHeap(100);
		heap.insertInHeap(90);
		heap.insertInHeap(80);
		heap.insertInHeap(70);
		heap.insertInHeap(60);
		heap.insertInHeap(50);
		heap.insertInHeap(40);
		heap.insertInHeap(30);
		heap.insertInHeap(20);
		
		heap.extractHeadOfHeap();
		
		heap.insertInHeap(110);
		heap.extractHeadOfHeap();
		
	}
}//end of class
