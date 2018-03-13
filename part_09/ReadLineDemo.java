package part_09;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadLineDemo {

        public static void main(String[] args) throws Exception {
            InputStream is = null;
            InputStreamReader isr = null;
            BufferedReader br = null;

            try {

                // open input stream test.txt for reading purpose.
                is = new FileInputStream("/Users/johnbudreski/Desktop/CodingNomads/labs/java_labs_bali/part_09/random.txt");

                // create new input stream reader
                isr = new InputStreamReader(is);

                // create new buffered reader
                br = new BufferedReader(isr);

                String thisLine;

                // reads to the end of the stream
                while((thisLine = br.readLine()) != null) {

                    // prints character
                    System.out.println(thisLine);
                }

            } catch(Exception e) {
                e.printStackTrace();
            } finally {

                // releases resources associated with the streams
                if(is!=null)
                    is.close();
                if(isr!=null)
                    isr.close();
                if(br!=null)
                    br.close();
            }
        }
    }

