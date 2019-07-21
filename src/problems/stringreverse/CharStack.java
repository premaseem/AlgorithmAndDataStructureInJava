package problems.stringreverse;

public class CharStack {

    int maxSize;
    int top = -1;
    char[] charStack;

    public CharStack(int maxSize){
        this.maxSize = maxSize;
        charStack = new char[maxSize];
    }

    public void push(char c){
        top++;
        charStack[top] = c;
    }

    public char pop(){
        int old_top = top;
        top--;
        return charStack[old_top];
    }

    public boolean isEmpty(){
        return top < 0;
    }

}

