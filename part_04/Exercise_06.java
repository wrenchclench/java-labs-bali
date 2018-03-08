package part_04;


/**
 * Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 * it cannot be retrieved again) of integers 0 through 100. Then print out every other
 * value in the queue.
 * <p>
 * expected output: 0,2,4,6,8.....100
 */


class Queue {
    private int q[];               // this array holds the queue
    private int putloc, getloc;     // the put and get indices

    Queue(int size) {
        q = new int[size];         // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a int into the queue

    public void put(int i) {
        if (putloc == q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        q[putloc] = i;
        putloc++;
    }

    // get a int from the queue
    public int get() {
        if (getloc == putloc) {
            System.out.println(" -- Queue is empty.");
            return (int) 0;
        }

        return q[getloc++];
    }
}

class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        int q;
        int i;

        System.out.println("Using bigQ to store numbers 1-100.");
        // put some numbers into bigQ
        for (i = 0; i < 100; i++) {
            bigQ.put(i);
        }

        // retrieve and display every other element from bigQ
        System.out.print("Contents of every other element in bigQ: ");
        for (i = 100; i > 0; i--) {
            q = bigQ.get();
            if (i % 2 == 0) System.out.print(q);
        }
    }
}