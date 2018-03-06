package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("How far are you going? (in miles): ");
        // assign input to variable as int
        float miles = scanner.nextInt();

        // prompt user
        System.out.print("What's the cars MPG?: ");
        // assign input to variable as int
        float mpg = scanner.nextInt();

        // prompt user
        System.out.print("What's the price per gallon?: ");
        // assign input to variable as int
        float ppg = scanner.nextInt();

        float cost = ((miles/mpg)*ppg);

        System.out.println("Your trip will cost " + cost);

    }
}