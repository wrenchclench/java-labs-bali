package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {

        long pop = 380123456;
        long born = 6;
        long died = 12;
        long immigrate = 40;
        long time = 94608000;

        long bday = time/born;
        long funeral = time/died;
        long welcome = time/immigrate;

        long answer = (pop+bday+welcome)-funeral;

        System.out.println("After 3 years the population is " + answer );
    }

}