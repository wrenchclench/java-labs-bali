package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user to get Radius
        System.out.print("What is the radius? : ");
        // assign input to variable as int
        double r = scanner.nextInt();

        // prompt user to get Length
        System.out.print("What is the length? : ");
        // assign input to variable as int
        double l = scanner.nextInt();

        //Volume formula
        double v = (Math.PI*r*r*l);
        // Area formula
        double a = (2*Math.PI*r*l) + (2*Math.PI*Math.pow(r,2));

        System.out.println("Cool beans, the area is " + a + " and the volume is " + v);

    }


}