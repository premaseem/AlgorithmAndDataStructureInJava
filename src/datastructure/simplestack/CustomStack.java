package datastructure.simplestack;

public class CustomStack {

    int top = -1;
    int maxSize = 10;
    long[] stackArray;

    public CustomStack(int maxSize){
        this.maxSize = maxSize;
        stackArray = new long[maxSize];
    }

    public void push(int value) {
        if(isFull()){
            System.out.println("Cannot add more as stack is already full ");
        }else {
            top++;
            stackArray[top] = value;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Cannot pop more since stack is empty");
            return -1;
        }else {
            int old_top = top;
            top--;
            return (int) stackArray[old_top];
        }
    }

    public int peak(){
        System.out.println("top element of stack is");
        return (int) stackArray[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == (maxSize-1);
    }

    public void printStack(){
        System.out.println("current values in stack are ");
        for(int i=0; i<=top;i++){
            System.out.println(stackArray[i]);
        }
    }
}
