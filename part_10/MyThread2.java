package part_10;

public class MyThread2 extends Thread {

    MyThread2(String name){
        super(name);
        start();
    }

    public void run(){
        System.out.println("Running a thread from the thread class");
    }
}

class MyThread2Demo {
    public static void main(String[] args) {

        MyThread2 thread1 = new MyThread2("Somethread");
    }
}