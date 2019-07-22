package datastructure.simplequeue;

public class CustomQueue {

    int front=0, rear=0, items =0, maxSize=10;

    long[] queueArray;

    public CustomQueue(int maxSize){
        this.maxSize = maxSize;
        queueArray = new long[maxSize];
    }

    public void insert(int value) throws Exception {
        if(rear == maxSize-1){
            System.out.printf("Cannot insert as Queue is full");
            throw new Exception("Cannot insert");
        }else {
            queueArray[rear] = value;
            rear++;
            items++;
        }
    }

    public void remove(){
        if(front < rear && front < maxSize){
            front++;
            items--;
        }else{
            System.out.println("no element to remove");

        }
    }

    public long peakFront(){
        return queueArray[front];
    }

    public Long peakRear(){
        if(rear == 0 ){
            return null;
        }
        return queueArray[rear-1];
    }

    public void printQueue(){
        for(int i=front; i<rear;i++){
            System.out.println(queueArray[i]);
        }
    }

    public int queueLenght(){
        return items;
    }

}
