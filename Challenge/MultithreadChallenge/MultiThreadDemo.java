package Challenge.MultithreadChallenge;

/*
    Write a multithreaded application that will do the following:
    - Use four threads to read four individual files (ie, file1, file2, file3, file4) - each thread is responsible for
        reading one file.
    - Write the contents of all four files, in sequential order (1 -> 2 -> 3 -> 4) into file5.
 */

import part_10.MyThread;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.util.ArrayList;

public class MultiThreadDemo {

    public static void main(String[] args) {

        try {
            ArrayList<ReadFile> threads = new ArrayList();

            for (int i = 1; i <= 4; i++) {
                ReadFile t = new ReadFile("file" + i + ".txt");
                threads.add(t);
                threads.get(i - 1).thrd.join();
            }
        } catch (InterruptedException e) {

        }
    }
}

