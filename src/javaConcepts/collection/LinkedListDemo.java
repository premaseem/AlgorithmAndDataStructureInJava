package javaConcepts.collection;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Deque<Integer> q = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

//        ll.poll();

        q.addFirst(5);
        q.push(4);
        q.pop();
        q.pollFirst();
        ll.addFirst(5);
        System.out.println(ll.indexOf(30));
        ll.add(2,-20);
//        ll.pollLast();
        System.out.println(ll);
    }




}
