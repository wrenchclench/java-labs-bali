package part_10;

public class Thread3 implements Runnable {

    Thread thrd;

    public Thread3(String name){
        thrd = new Thread(this, "Thread 3");
        thrd.start();
    }
    @Override
    public void run(){
        System.out.println("This is thread3");
    }
}
