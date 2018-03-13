package part_09;
//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercise_02 {

    public static void main(String[] args)throws IOException {
        BufferedInputStream bf = new BufferedInputStream(System.in);

        try {
            int i;
            while((i = bf.read()) != -1) {
                char c = (char) i;
                System.out.println(c);
            }
        }
        finally{
            bf.close();
        }


    }
}
