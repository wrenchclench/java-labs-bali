package part_10;

public class Thread2 implements Runnable {

    Thread thrd;

    public Thread2(String name){
        thrd = new Thread(this, "Thread2");
        thrd.start();
    }

    @Override
    public void run(){
        System.out.println("This is thread2");
    }
}
