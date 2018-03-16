package Challenge;

//challenge:
//        - write a class that will use a bufferedReader to read the data in the file and map it to a custom Java object
//- make a new java object for each line of the CSV using ".split()"
//        - add each object to an ArrayList of the object type
//        - use a for-each loop to calculate the total population in the file and the total number of refugees
//        - then create a ratio for the number of refugees in the total population
//
//        - bonus - break it down by individual years
//


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RefugeeCalculator {

    public static void main(String[] args) {

        RefugeeCalculator obj = new RefugeeCalculator();

        //Specify file path to import data
        String path = "/Users/johnbudreski/Desktop/refugees_per_capita.csv";

        ArrayList<RefugeeStats> stats = obj.parseFile(path);

        System.out.println("Ratio of refugees to population is " + totalRefuPop(stats)/totalPop(stats));

    }

    public ArrayList<RefugeeStats> parseFile(String path) {

        //Generate an ArrayList to store the incoming data
        ArrayList<RefugeeStats> refugeeData = new ArrayList();

        // Generate reader to read csv file
        try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {


            String sCurrentLine;
            // While readline does not equal null, keep reading lines
            while ((sCurrentLine = br.readLine()) != null) {

                // Print out the lines of the ArrayList
                //System.out.println(sCurrentLine);

                // Keep generating Arrays while going over certain characters
                String[] refuData = sCurrentLine.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");

                // If the array does not have all of the th required indices (full or empty) then skip it.
                if (refuData.length < 5) {
                    continue;
                }
                //
                RefugeeStats refu = new RefugeeStats();

                try {
                    refu.setCount(Integer.parseInt(refuData[0]));
                } catch (Exception exc0) {
                    refu.setCount(0);
                }
                try {
                    refu.setYear(Integer.parseInt(refuData[1]));
                } catch (Exception exc1) {
                    refu.setYear(0);
                }
                try {
                    refu.setCountry((refuData[2]));
                } catch (Exception exc2) {
                    refu.setCountry("null");
                }
                try {
                    refu.setPopulation(Double.parseDouble(refuData[3]));
                } catch (Exception exc3) {
                    refu.setPopulation(0);
                }
                try {
                    refu.setRefugees(Double.parseDouble(refuData[4]));
                } catch (Exception exc4) {
                    refu.setRefugees(0);
                }
                try {
                    refu.setRefPerCap(Double.parseDouble(refuData[5]));
                } catch (Exception exc5) {
                    refu.setRefPerCap(0);
                }

                refugeeData.add(refu);
            }

        } catch (IOException exc) {
            exc.printStackTrace();
        }
        return refugeeData;
    }

    public static double totalPop(ArrayList<RefugeeStats> data) {

        // For each object of RefugeeStats in the ArrayList of RefugeeStats objects get the population and add them
        double sum = 0;

        for (RefugeeStats r : data) {
            sum += r.getPopulation();
        }

        System.out.println("The sum of the populations all time is " + sum);
        return sum;
    }

    public static double totalRefuPop(ArrayList<RefugeeStats> data) {

        double refuSum = 0;

        // For each object of RefugeeStats in the ArrayList of RefugeeStats objects get the refugee population and add them

            for (RefugeeStats r : data) {
                    refuSum += r.getRefugees();
            }

        System.out.println("The sum of the refugees all time is " + refuSum);
        return refuSum;
    }
}





