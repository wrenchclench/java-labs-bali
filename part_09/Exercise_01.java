package part_09;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;

/**
 * Complete the coding challenges in questions 7 & 8 in the self test for chapter 10.
 * <p>
 * Complete the coding challenges in questions 8 and 12 in the self test for chapter 11.
 */
public class Exercise_01 {

}

class q7 {
    public static void main(String[] args) {

        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            // Creating objects input and output to open files
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                // Swap spaces for hyphens
                i = fin.read();
                if ((char) i == ' ') i = '-';
                // If the file is not fully read write out
                if (i != -1) fout.write(i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("IO Error" + exc);
        } finally {
            try {
                // Close the file
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error closing input file");
            }

            try {
                if (fin != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Error closing output file");
            }
        }
    }
}




