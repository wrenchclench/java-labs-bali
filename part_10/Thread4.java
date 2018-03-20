package part_10;

public class Thread4 implements Runnable {

    Thread thrd;

    public Thread4(String name){
        thrd = new Thread(this, "Thread 4");
        thrd.start();
    }

    @Override
    public void run(){
        System.out.println("This is thread4");
    }
}
