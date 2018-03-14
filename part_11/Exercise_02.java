package part_11;

/**
 Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02 {

    public static  <E> void switchElements(E[] someArray){

        someArray[0] = someArray[someArray.length -1];

    }
    public static void main(String[] args) {

        Integer[] myArray = {10,20};

        switchElements(myArray);
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);


    }
    
}

