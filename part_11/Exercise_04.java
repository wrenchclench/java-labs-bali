package part_11;

/**
 make a new generic method called sumArray that will return the
 sum of all numbers in the array (no matter data type of numbers
 the array has in it)
 */


public class sumArray <E extends Number> {

    public E sumArray(E[] randomArray) {

        long sum = 0;

        for (int i = 0; i < randomArray.length; i++) {
            for (E j : randomArray)
                sum += j.longValue();


        } return null;
    }
}


