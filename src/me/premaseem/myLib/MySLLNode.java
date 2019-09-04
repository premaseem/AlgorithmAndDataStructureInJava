package me.premaseem.myLib;

public class MySLLNode {
    public int data;
    public MySLLNode next;

    public MySLLNode(int data) {
        this.data = data;
    }

    public MySLLNode(int data, MySLLNode next) {
        this.data = data;
        this.next = next;
    }

    // Constructor to convert array into singly linked list
    public MySLLNode(int[] arr){
        data = arr[0];
        MySLLNode curr = this;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new MySLLNode(arr[i]);
            curr = curr.next;
        }

    }

    public void print(){
        MySLLNode c = this;
        System.out.print(" Singly Linked List is ");
        while(c!=null){
            System.out.print( " >> " + c.data );
            c = c.next;
        }
        System.out.println();
    }
}