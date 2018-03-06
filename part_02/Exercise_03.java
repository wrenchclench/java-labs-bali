package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user for feet
        System.out.print("How many feet?:  ");
        // assign input to variable as int
        double f = scanner.nextInt();

        double m = f*.305;

        System.out.println("That's " + m + "in meters");
    }

}