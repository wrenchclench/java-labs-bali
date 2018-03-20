package Challenge.MultithreadChallenge;

/*
    Write a multithreaded application that will do the following:
    - Use four threads to read four individual files (ie, file1, file2, file3, file4) - each thread is responsible for
        reading one file.
    - Write the contents of all four files, in sequential order (1 -> 2 -> 3 -> 4) into file5.
 */

import Challenge.RefugeeStats;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile implements Runnable {

    Thread thrd;
    private String text;
    private String inputFileName;

    public ReadFile(String inputFileName) {
        this.inputFileName = inputFileName;
        text = new String();
        thrd = new Thread(this);
        thrd.start();
    }

    @Override
    public void run(){
        String path = "/Users/johnbudreski/Desktop/CodingNomads/labs/java_labs_bali/Challenge/";
        String outPutFileName = "MergedFile.txt";

        text = read(path + inputFileName);

        write(text,path + outPutFileName);
    }

    public synchronized String read(String path) {
        String text = new String();
        try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                text += "\n" + currentLine;
            }
        }
        catch (IOException e) {

        }
        return text;
    }

    public synchronized void write(String text, String path) {
        try (FileWriter fw = new FileWriter(path, true)) {
            fw.write(text);
        }
        catch (IOException e) {

        }
    }
}


