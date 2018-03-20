package part_10;

public class Thread5 implements Runnable {

    Thread thrd;

    public Thread5(String name){
        thrd = new Thread(this, "Thread5");
        thrd.start();
    }

    @Override
    public void run(){
        System.out.println("This is thread5");
    }
}
