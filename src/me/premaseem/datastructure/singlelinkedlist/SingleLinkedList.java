package me.premaseem.datastructure.singlelinkedlist;

public class SingleLinkedList {
        Node first = null;

        public void insertFirst(int data){
            Node newNode = new Node(data);
            newNode.next = first;
            this.first = newNode;
        }

        public void insertLast(int data){
            Node newNode = new Node(data);
            if ( first == null){
                first = newNode;
            return;
            }
            Node current = first;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }

        public int length(){
            int length =0;
            Node current = first;
            while(current != null){
                length++;
                current = current.next;
            }
            return length;
        }

        public Node removeFirst(){
            Node temp = first;
            if(first != null){
                first = temp.next;
            }
            return temp;
        }

        public void printLinkedList(){
            Node current = first;
            System.out.print("[");
            while(current != null){
                System.out.print(" "+current.data);
                current = current.next;
            }
            System.out.print(" ]");
        }

}
