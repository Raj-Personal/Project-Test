package src.co.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class processor implements Runnable{
    private int id;
    processor(int id){
        this.id=id;
    }

    @Override
    public void run() {
        System.out.println("Starting "+id);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed "+id);
    }
}

public class ThreadPool
{
    public static void main(String[] args) {
        ExecutorService exec=Executors.newFixedThreadPool(2);

        for(int i=1;i<6;i++)
        {
            exec.submit(new processor(i));
        }
        exec.shutdown();
        System.out.println("All task submitted");
        try {
            exec.awaitTermination(1, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
