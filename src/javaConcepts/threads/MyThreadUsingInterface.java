package javaConcepts.threads;

/**
 * Created by asee2278 on 2/5/17.
 */

class MyThreadUsingInterface implements Runnable{

    public void run(){
        System.out.println("thread is running...");
        System.out.println("thread's task is to bring medicne ...");

    }

    public static void main(String args[]){
        MyThreadUsingInterface m1=new MyThreadUsingInterface();
        Thread t1 =new Thread(m1);
        t1.start();
    }
}