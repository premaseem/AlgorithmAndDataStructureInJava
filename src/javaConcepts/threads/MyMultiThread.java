package javaConcepts.threads;

/**
 * Created by asee2278 on 2/6/17.
 */


// This is job for Data migration
class Job implements Runnable{

    @Override
    public void run() {
        System.out.println("copy from a ");
        System.out.println("paste in b ");
    }

    public void sleep() {
        System.out.println("slept for a while ");
    }



}

public class MyMultiThread {


    public static void main(String args[]){
//        Thread t1 =new Thread(new Job());
//        Thread t2 =new Thread(new Job());
//        Thread t3 =new Thread(new Job());

        Job job1 = new Job();
        Job job2 = new Job();
        Job job3 = new Job();

        Thread t1 = new Thread(job1);
        Thread t2 = new Thread(job2);
        Thread t3 = new Thread(job3);

        t1.start();
        t2.start();
        t3.start();


//        job1.run();
//        job1.sleep();
//        job2.run();
//        job2.sleep();
//        job3.run();
//        job3.sleep();


//        t1.start();
//        t2.start();
//        t3.start();

    }
}