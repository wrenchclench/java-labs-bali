package part_01;

/**
 * Part 1 Exercise 8:
 *
 *      Write the necessary code that prints out the area
 *      and perimeter of a circle with a radius of 3.14
 *
 *
 */
public class Exercise_08 {

    public static void main(String[] args) {
        double r,p,a;
        // radius
        r = 3.14;
        // Perimeter formula
        p = (r*2*Math.PI);
        // Area formula
        a = (Math.PI*r*r);



        System.out.println ("Perimeter is " + p);
        System.out.println ( "Area is " + a);
    }
}

