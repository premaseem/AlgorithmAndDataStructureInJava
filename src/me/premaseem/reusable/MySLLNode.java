package me.premaseem.reusable;

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
}