package javaConcepts.threads;

/**
 * Created by asee2278 on 2/5/17.
 */

class MyThread extends Thread {

    public void run(){

        for(int i=1;i<5;i++){

            try{
                Thread.sleep(500);
            }catch(InterruptedException e)
            {System.out.println(e);
            }
            System.out.println(i + " is printed by thread " + this.getName());
        }

    }

    public static void main(String args[]){
        MyThread t1=new MyThread();
        t1.setName("First Thread");

        MyThread t2=new MyThread();
        t2.setName("Second Thread");

        t1.start();
        t1.start();
    }
}


//interface Vehicle {
//
//    void move();
//
//}
//
//interface Locomotive {
//    void move();
//}
//
//
//class Train implements Vehicle , Locomotive {
//
//
//    public static void main(String[] args) {
////       new Train().move();
//    }
//
//
//    @Override
//    public void move() {
//
//    }
//}


//class Car extends Vehicle implements Runnable {
//
//    /**
//     * When an object implementing interface <code>Runnable</code> is used
//     * to create a thread, starting the thread causes the object's
//     * <code>run</code> method to be called in that separately executing
//     * thread.
//     * <p>
//     * The general contract of the method <code>run</code> is that it may
//     * take any action whatsoever.
//     *
//     * @see Thread#run()
//     */
//    @Override
//    public void run() {
//        System.out.print("Take passengers using road ");
//    }
//}
//
//class AirPlane extends Vehicle implements Runnable {
//
//    /**
//     * When an object implementing interface <code>Runnable</code> is used
//     * to create a thread, starting the thread causes the object's
//     * <code>run</code> method to be called in that separately executing
//     * thread.
//     * <p>
//     * The general contract of the method <code>run</code> is that it may
//     * take any action whatsoever.
//     *
//     * @see Thread#run()
//     */
//    @Override
//    public void run() {
//        System.out.print("Take passengers using Air ");
//    }
