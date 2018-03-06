package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 6:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "switch-case" statement.
 *
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Give me a number: ");
        // assign input to variable as int
        int num = scanner.nextInt();

        switch (num) {
            case 0:
                System.out.println("Number is zero");
                break;
            case 1:
                System.out.println("Number is one");
                break;
            case 2:
                System.out.println("Number is two");
                break;
            case 3:
                System.out.println("Number is three");
                break;
            default:
                System.out.println("Ugh too hard, just pick between 0-3");
        }
    }

}