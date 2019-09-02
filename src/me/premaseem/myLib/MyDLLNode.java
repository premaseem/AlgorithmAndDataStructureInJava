package me.premaseem.myLib;

public class MyDLLNode {
    public int data;
    public MyDLLNode next;
    public MyDLLNode prev;

    public MyDLLNode(int data) {
        this.data = data;
    }

    public MyDLLNode(MyDLLNode p, int data, MyDLLNode n) {
        this.data = data;
        this.prev = p;
        this.next = n;
    }

    public MyDLLNode(int[] arr){
        MyDLLNode c = this;
        c.data = arr[0];
        for(int i =1; i<arr.length; i++){
            MyDLLNode n = new MyDLLNode(c,arr[i],null);
            c.next = n;
            c = c.next;
        }

    }
}