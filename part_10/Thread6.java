package part_10;

public class Thread6 extends Thread {

    public Thread6(String name){
        super("thread6");
        start();
    }

    @Override
    public void run(){
        System.out.println("This is thread6 extending the thread class");
    }


}
