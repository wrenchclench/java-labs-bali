package part_01;

/**
 * Part 1 Exercise 9:
 *
 *      Write the necessary code to display the area of a rectangle, as well as the perimeter of
 *      a rectangle that has a width of 2.4 and a height of 6.4
 *
 */
public class Exercise_09 {
    public static void main(String[] args) {

        double w,h,a,p;

        w = 2.4;
        h= 6.4;

        a = (w*h);
        p = ((w*2) + (h*2));

        System.out.println("Area is " + a + " Perimeter is " + p);


    }
}

