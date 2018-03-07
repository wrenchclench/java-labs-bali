package part_04;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.Scanner;
/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */

class SomeArray {
    public static void main(String[] args) {
        int myArray[] = new int[10];

        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
        myArray[5] = 6;
        myArray[6] = 7;
        myArray[7] = 8;
        myArray[8] = 9;
        myArray[9] = 10;

        System.out.println(myArray[1]);
        System.out.println(myArray[3]);
        System.out.println(myArray[5]);
        System.out.println(myArray[7]);
        System.out.println(myArray[9]);
        System.out.println(myArray[8]);
        System.out.println(myArray[6]);
        System.out.println(myArray[4]);
        System.out.println(myArray[2]);
        System.out.println(myArray[0]);

    }
}