package part_11;

/**
Let's say you have an integer array and a string array. Write a single method printArray that can print all
the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

Complete the code so that it prints the following lines:

 1
 2
 3
 Hello
 World

**/

class GenericsDemo {

    public static  <E> void printArray(E[] inputArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Integer[] numArray = {1, 2, 3};
        String[] strArray = {"Hello", "World"};

        printArray(numArray);
        printArray(strArray);


    }
}











