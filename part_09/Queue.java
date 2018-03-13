package part_09;

class Queue {
    private int q[];               // this array holds the queue
    private int putloc, getloc;     // the put and get indices

    Queue(int size) {
        q = new int[size];         // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a int into the queue

    synchronized public void put(int i) {
        if (putloc == q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        q[putloc] = i;
        putloc++;
    }

    // get a int from the queue
    synchronized public int get() {
        if (getloc == putloc) {
            System.out.println(" -- Queue is empty.");
            return (int) 0;
        }

        return q[getloc++];
    }
}