package part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */

public class Exercise_10 {

    public static void main(String[] args) {

        double km = 12;
        double secs = 1830;
        double avg = (secs/km)/60;

        System.out.println("Average per km is " + avg + " mins");

        double avgmiles = avg/1.6;

        System.out.println("Average per mile is "+ avgmiles + " mins");


    }

}