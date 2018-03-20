package part_10;

// 1) create 5 classes that each implement Runnable
// - each class should have a constructor that takes in a name and passes it to the Thread object along with "this"
// thrd = new Thread(this, name); before starting the Thread (in the constructor).

public class Thread1 implements Runnable {

    Thread thrd;

    public Thread1(String name){
        thrd = new Thread(this, "FirstThread");
        thrd.start();
    }
    @Override
    public void run(){
        System.out.println("This is Thread1");

    }


}
