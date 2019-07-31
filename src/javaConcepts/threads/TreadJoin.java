package javaConcepts.threads;

/**
 * Created by asee2278 on 2/6/17.
 */

class TreadJoin extends Thread{
    public void run(){

        if(Thread.currentThread().isDaemon()){//checking for daemon thread
            System.out.println("daemon thread work");
        }

        else {

            for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName());
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
        }
    }
    public static void main(String args[]){
        TreadJoin t1=new TreadJoin();
        t1.setName("Monitor Thread ");
        t1.setPriority(Thread.MAX_PRIORITY);

        TreadJoin t2=new TreadJoin();
        t2.setName("Normal student ");
        t2.setPriority(Thread.NORM_PRIORITY);

        TreadJoin t3=new TreadJoin();
        t3.setName("Dumb student ");
        t3.setPriority(Thread.MIN_PRIORITY);


        t1.start();
        t1.setDaemon(true);

        try{
            t1.join(1000);
        }catch(Exception e){System.out.println(e);}

        t2.start();
        t3.start();
    }
}