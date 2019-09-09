package me.premaseem.datastructure.heap.imp1;

public class Test {
    Heap heap = new Heap(20);

    @org.junit.Test
    public void insertTest(){
        heap.insert(10);
        heap.insert(100);
        heap.insert(20);
//        heap.print();

        heap.insert(50);
        heap.insert(15);
        heap.insert(35);
        heap.insert(45);
        heap.insert(5);

        heap.insert(51);
        heap.insert(11);
        heap.insert(351);
        heap.insert(451);
        heap.insert(51);
        heap.insert(9);
        heap.insert(10);
//        heap.print();
        heap.printTree();
//        heap.displayHeap1();

    }

}
