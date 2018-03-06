package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Guess a number: ");
        // assign input to variable as int
        int guess = scanner.nextInt();

        while (guess != 59){
            System.out.println("Nope, keep guessing..");
            break;
        }
        while (guess == 59) {
            System.out.println("Yep, it was 59.");
            break;

        }
    }

}

