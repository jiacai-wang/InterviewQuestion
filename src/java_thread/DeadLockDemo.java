package java_thread;

import java_io.Util;

public class DeadLockDemo {
    private static String A = "A";
    private static String B = "Ｂ";

    public static void main(String[] args){
        deadLock();
    }

    public  static void deadLock(){
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A){
                    try{
                        Thread.currentThread().sleep(2000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (B){
                        Util.print(1);
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B){
                    synchronized (A){
                        Util.print(2);
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
