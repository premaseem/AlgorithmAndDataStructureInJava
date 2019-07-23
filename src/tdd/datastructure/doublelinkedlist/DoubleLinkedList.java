package tdd.datastructure.doublelinkedlist;

public class DoubleLinkedList {

         Node first;
         Node last;

        public void insert(int data){
            Node node = new Node(data);
            Node current = first;

            if( current == null){
                first = node;
                last = node;
                return;
            }

            while(current.next !=null){
                current = current.next;
            }
            current.next = node;
            node.previous = current;
            last = node;
        }

        public void printForward(){
            Node current = first;
            System.out.print("[");
            while(current != null){
                System.out.print(" "+current.data);
                current = current.next;
            }
            System.out.print(" ]");
        }

        public int length(){
            int length =0;
            Node current = first;
            while(current != null){
                current = current.next;
                length++;
            }
            return length;
        }


    public void printBackwords() {
            Node current =  last;
            System.out.print("[");
            while(current != null){
                System.out.print(" "+current.data);
                current = current.previous;
            }
        System.out.println(" ]");
    }
}

