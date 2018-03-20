package part_10;

public class Thread7 extends Thread {

    Thread thrd;

    public Thread7(String name){
        super("thread7");
        start();
    }

    @Override
    public void run(){
        System.out.println("This is thread7");
    }
}
