package me.premaseem.datastructure.stacks;


// Test Driven Development by Aseem Jain

import org.junit.Test;


public class StackWithArray {

    int[] sa;
    int pointer;

    public StackWithArray(){
        sa = new int[10];
        pointer=-1;
    }


    boolean push(int e){
        if (pointer >= sa.length){
            return false;
        }
        pointer++;
        sa[pointer] = e;
        return true;
    }

    boolean isEmpty(){
        return pointer < 0;
    }

    int pop(){

        int v = sa[pointer];
        pointer--;
        return v;
    }

    boolean search(int e){
        for ( int item : sa){
            if (item == e){
                return true;
            }
        }
        return false;
    }

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        StackWithArray sa = new StackWithArray();
        assert sa.isEmpty();
        assert sa.push(7);
        assert sa.push(4);

        assert sa.search(7);
        assert ! sa.search(6);

        assert ! sa.isEmpty();
        assert 4 == sa.pop();
        assert 7 == sa.pop();
        assert sa.isEmpty();




    }
}

