package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Give me a number: ");
        // assign input to variable as int
        int number = scanner.nextInt();

            if (number == 1) {
                System.out.println("ONE");
                if (number == 2) {
                    System.out.println("TWO");
                    if (number == 3) {
                        System.out.println("THREE");
                        if (number == 4) {
                            System.out.println("FOUR");
                            if (number == 5) {
                                System.out.println("FIVE");

                            }
                        }
                    }

                }

            }
        }
    }
