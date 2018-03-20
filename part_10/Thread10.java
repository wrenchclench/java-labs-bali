package part_10;

public class Thread10 extends Thread {

    public Thread10(String name){
        super("thread10");
        start();
    }
    @Override
    public void run(){
        System.out.println("This is thread10");
    }
}
