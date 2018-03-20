package part_10;

public class Thread9 extends Thread {

    public Thread9(String name){
        super("thread9");
        start();
    }
    @Override
    public void run(){
        System.out.println("this is thread9");
    }
}
