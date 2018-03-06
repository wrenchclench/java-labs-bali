
package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Investment: ");
        // assign input to variable as int
        int principal = scanner.nextInt();

        // prompt user
        System.out.print("Interest Rate: ");
        // assign input to variable as int
        int interest = scanner.nextInt();

        // prompt user
        System.out.print("Term (in years): ");
        // assign input to variable as int
        int term = scanner.nextInt();

        double rate = (1 + interest/100);
        double totalReturn = principal*(Math.pow(rate, term));

        System.out.println("Your financial return is " + totalReturn);
    }

}


