package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user for pounds
        System.out.print("How many pounds?:  ");
        // assign input to variable as int
        double p = scanner.nextInt();

        double k = p*.454;

        System.out.println("That's " + k + "in kilos");
    }

}

