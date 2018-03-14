package part_11;



/**
 * Modify your Queue Class so that it is completely generic
 */

class GenericQueue <E> {
    private E q[];               // this array holds the queue
    private int putloc, getloc;     // the put and get indices

    GenericQueue(E[] array) {
        q = array;         // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a int into the queue

    public void put(E i) throws QueueFullException {
        if (putloc == q.length) {
            throw new QueueFullException();
        }

        q[putloc] = i;
        putloc++;
    }

    // get a int from the queue
    public E get() throws QueueEmptyException{
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }

        return q[getloc++];
    }
}

class QueueEmptyException extends Exception {
    @Override
    public String toString() {
        return "\nQueue is empty";
    }
}

class QueueFullException extends Exception {
    @Override
    public String toString() {
        return "\nQueue is full";
    }
}

class GenericQDemo {
    public static void main(String args[]) {
        Integer[] someArray = new Integer[100];
        GenericQueue<Integer> bigQ = new GenericQueue(someArray);
        int q;
        int i;

        System.out.println("Using bigQ to store numbers 1-100.");

        try {
            // put some numbers into bigQ
            for (i = 0; i < 100; i++) {
                bigQ.put(i);
            }
        } catch (QueueFullException exc){
            System.out.println(exc.toString());

        }

        // retrieve and display every other element from bigQ
        try {
            System.out.print("Contents of every other element in bigQ: ");
            for (i = 101; i > 0; i--) {
                q = bigQ.get();
                if (i % 2 == 0) System.out.print(q);

            }
        }catch (QueueEmptyException exc){
            System.out.println(exc.toString());
        }
    }
}

