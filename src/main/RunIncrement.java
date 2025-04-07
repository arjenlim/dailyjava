package main;

public class RunIncrement implements Runnable {
    private int myNumber = 0;


    public int getMyNumber() {
            return myNumber;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis() - start < 10000){
            if(myNumber == Integer.MAX_VALUE){
                myNumber = 0;
            }else{
                myNumber++;
            }
        }
    }

    public static void main(String[] args){
        RunIncrement run1 = new RunIncrement();
        RunIncrement run2 = new RunIncrement();
        RunIncrement run3 = new RunIncrement();

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        Thread t3 = new Thread(run3);

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(run1.getMyNumber());
        System.out.println(run2.getMyNumber());
        System.out.println(run3.getMyNumber());
    }
}
