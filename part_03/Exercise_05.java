package part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Give me a number: ");
        // assign input to variable as int
        int num = scanner.nextInt();

        // use the && operator to see if the user's number is divisible by both 4 and 7

        if (num % 4 == 0 && num % 7 == 0){
            System.out.println("divisable by 4 and 7");
        }


        // use the || operator to see if the user's number is divisible by 4 or 7
        if (num % 4 == 0 || num % 7 == 0){
            System.out.println("divisable by 4 or 7");
        }

        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        if (num % 4 == 0 ^ num % 7 == 0){
            System.out.println("divisable by 4 or 7 exclusively");
        }


        // print out the results

    }
}


