package part_10;

public class Thread8 extends Thread {

    Thread thrd;

    public Thread8(String name){
        super("thread8");
        start();
    }

    @Override
    public void run(){
        System.out.println("This is thread8");
    }
}
