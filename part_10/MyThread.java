package part_10;

public class MyThread implements Runnable {

    Thread thrd;

    MyThread(String name){
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run(){
        System.out.println("Running a thread");

        System.out.println("Name = " + thrd.getName());

    }

    synchronized int someMeth(int a, int b){
        return a+b;
    }

    synchronized int anotherMeth (int c, int d){
        return c*d;
    }
}

class Join {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread("Thread1");
        MyThread thread2 = new MyThread("Thread2");

        thread1.thrd.setPriority(3);
        thread2.thrd.setPriority(5);

        try {
            thread1.thrd.join();
            System.out.println("Thread1 joined");
            thread2.thrd.join();
            System.out.println("Thread2 joined");

        }catch (InterruptedException exc){
            System.out.println("Thread interrupted");
        }
    }
}
