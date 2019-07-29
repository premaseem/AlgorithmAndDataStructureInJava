package codebase1.datastructure.doublelinkedlist;

public class DoubleLinkedList {

         Node first;
         Node last;

        public void insert(int data){
            Node node = new Node(data);
            Node current = last;

            if( current == null){
                first = node;
                last = node;
                return;
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

    public boolean deleteNodeWith(int data){
        Node target = getTargetNode(data);
        if (target == null){
            return false;
        }
        Node after = target.next;
        Node before = target.previous;

        before.next = after;
        after.previous = before;
        return true;
    }

    public boolean insertNodeAfter(int key, int data){
        Node target = getTargetNode(key);
        if (target == null){
            return false;
        }

        Node newNode = new Node(data);


        Node after = target.next;
        target.next = newNode;
        newNode.next = after;
        newNode.previous = target;
//        Node before = target.previous;
//
//        before.next = after;
//        after.previous = before;
        return true;
    }

    private Node getTargetNode(int key){
            Node current = first;
            while(current != null ){
                if(current.data == key){
                    return current;
                }
                current = current.next;
            }
            return null;
    }
}

