package codebase1.datastructure.simplequeue;

public class CustomCircularQueue extends CustomQueue {

    public CustomCircularQueue(int maxSize) {
        super(maxSize);
    }

    public void insert(int value) {
        queueArray[rear] = value;
        items++;
        if(rear == maxSize-1){
            rear = 0;
//            front++;
        }else{
            rear++;

        }
    }

    public Long peakRear(){
        if(rear == 0){
            return queueArray[maxSize -1];
        }
        return queueArray[rear-1];
    }

    public void remove(){
        front++;
        items--;
        if(front == maxSize){
            front =0;
        }

    }
}
