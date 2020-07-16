package javaConcepts.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *     Java Thread Pool
 *         Java Thread pool represents a group of worker threads that are waiting for the job and reuse many times.
 *
 *         In case of thread pool, a group of fixed size threads are created. A thread from the thread pool is pulled out and assigned a job by the service provider. After completion of the job, thread is contained in the thread pool again.
 *
 *         Advantage of Java Thread Pool
 *         Better performance It saves time because there is no need to create new thread.
 *
 *         Real time usage
 *         It is used in Servlet and JSP where container creates a thread pool to process the request.
 */

class WorkerThread implements Runnable {
    private String message;
    public WorkerThread(String s){
        this.message=s;
    }
 
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
        processmessage();
        System.out.println(Thread.currentThread().getName()+" (End)");
    }
 
    private void processmessage() {
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }
    }
   
}


public class SimpleThreadPool {
 
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
 
}

