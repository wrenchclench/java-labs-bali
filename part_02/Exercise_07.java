package part_02;


import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Give me a number of minutes (under 1T): ");
        // assign input to variable as int
        int mins = scanner.nextInt();

        // Number of minutes in a year
        int year = mins / 525600;
        int remainingMinutes = mins % 525600;
        int day = remainingMinutes / 1440;

        System.out.println(mins + " minutes is about " + year + " years and " + day + " days.");


    }

}


