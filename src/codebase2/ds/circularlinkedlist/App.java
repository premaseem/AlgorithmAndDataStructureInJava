package codebase2.ds.circularlinkedlist;

public class App {

	public static void main(String[] args) {
		CircularLinkedList mylist = new CircularLinkedList();
		mylist.insertFirst(100);
		mylist.insertFirst(50);
		mylist.insertFirst(99);
		mylist.insertFirst(88);
		mylist.insertLast(9999999);
		
		mylist.displayList();
	}

}
