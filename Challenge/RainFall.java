package Challenge;

//challenge:
//        - write a class that will use a bufferedReader to read the data in the file and map it to a custom Java object
//- make a new java object for each line of the CSV using ".split()"
//        - add each object to an ArrayList of the object type
//        - use a for-each loop to calculate the total population in the file and the total number of refugees
//        - then create a ratio for the number of refugees in the total population
//
//        - bonus - break it down by individual years
//        example from Rainfall example:


//public static void main(String[] args) {
//        String path = "/Users/ryandesmond/Documents/codingnomads/Mexico_CN/CodingNomads_MX/example/rainfall.txt";
//
//        ArrayList<Rainfall> rainData = new ArrayList();
//
//        try (FileReader fr = new FileReader(path) ; BufferedReader br = new BufferedReader(fr)) {
//
//        String sCurrentLine;
//
//        while ((sCurrentLine = br.readLine()) != null) {
//        System.out.println(sCurrentLine);
//        String[] data = sCurrentLine.split(",");
//        Rainfall obj = new Rainfall();
//        obj.setState(data[0]);
//        obj.setTown(data[1]);
//        obj.setDate(data[2]);
//        obj.setTotalPrecipitation(Double.parseDouble(data[3]));
//        rainData.add(obj);
//        }
//        } catch (IOException e) {
//        e.printStackTrace();
//        }
//
//        double totalPrecip = 0.0;
//        for (Rainfall r : rainData) {
//        r.toString();
//        totalPrecip += r.getTotalPrecipitation();
//        }
//
//        System.out.println("total Precipitation = " + totalPrecip);
//
//        }
