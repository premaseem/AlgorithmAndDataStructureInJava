package tdd.datastructure.heap;

public class Heap {

    Node[] heapArray;
    int maxSize;
    int currentSize;

    public Heap(int size){
        maxSize = size;
        currentSize =0;
        heapArray = new Node[maxSize];
    }

    boolean isEmpty(){
        return currentSize ==0;
    }

    boolean isFull(){
        return currentSize == maxSize;
    }

    boolean insert(int key){
        if (isFull()){
            return false;
        }

        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(currentSize);

        currentSize++;
        return true;
    }

    private void trickleUp(int ci) {
        int parentIndex = (ci-1)/2;
        Node nodeToInsert = heapArray[ci];

            while(ci > 0 && heapArray[parentIndex].key < nodeToInsert.key){
                heapArray[ci] = heapArray[parentIndex];
                ci = parentIndex;
                parentIndex = (parentIndex-1)/2;
            }
        heapArray[ci] = nodeToInsert;
    }

    void print(){
        for(int i=0; i<currentSize; i++){
            System.out.println(heapArray[i].key);
        }
    }

    Node remove(){
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }

    private void trickleDown(int idx) {

        int largerChildIdx;
        Node top = heapArray[idx]; // save last into top variable

        // will run as long as idx is not on the bottom row (at least 1 child)
        while(idx < currentSize/2) {
            int leftChildIdx = 2*idx + 1; // left child idx position
            int rightChildIdx = leftChildIdx + 1; // right child idx position

            // figure out which child is larger
            if(rightChildIdx < currentSize &&
                    heapArray[leftChildIdx].key < heapArray[rightChildIdx].key) {
                largerChildIdx = rightChildIdx;
            } else {
                largerChildIdx = leftChildIdx;
            }

            if(top.key >= heapArray[largerChildIdx].key) {
                // successfully made root the largest key
                break;
            }

            heapArray[idx] = heapArray[largerChildIdx];
            idx = largerChildIdx; // go down

        }
        heapArray[idx] = top;

    }

    void printTree(){
        int row =1;
        int p = 0;
        printSpace(0);
        System.out.println(" "+heapArray[0].key);
        for(int i=1;i<currentSize;i++){
            System.out.print(" "+heapArray[i].key);
            if(i ==row ){
                System.out.println();
                p++;
                row = (int) (i+ Math.pow(2, p));
                printSpace(p);
            }
        }
    }

    void printSpace(int row){
        int space = 50 - (3 * row);
        for(int i=0;i<space;i++){
            System.out.print(" ");
        }
    }

    public void displayHeap() {
        System.out.println("Heap Array: ");
        for(int m = 0; m < currentSize; m++) {
            if(heapArray[m] != null) {
                System.out.print( heapArray[m].key + " ");
            }
            System.out.println();

            int nBlanks = 32;
            int itemsPerRow = 1;
            int column = 0;
            int j = 0; // current item

            String dots = "...............................";
            System.out.println(dots+dots);
            while(currentSize > 0) {
                if(column == 0) {
                    for(int k = 0; k < nBlanks; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.print(heapArray[j].key);
                j++;
                if(j == currentSize) {
                    break;
                }

                column++;
                // end of row
                if(column == itemsPerRow) {
                    nBlanks = nBlanks/2; // half the blanks
                    itemsPerRow = itemsPerRow * 2;     // twice the items
                    column = 0;
                    System.out.println();
                } else {
                    for(int k=0; k<nBlanks*2; k++) {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("\n"+dots+dots);
        }



    }


}
