package part_03;


/**
 * Implement the getMonthName() method
 */

class Exercise_03 {

    public static void main(String[] strings) {


        // use a for loop to iterate 1000 times
        for (int i = 0; i < 1000; i++) {

            // Generate a random int between >= 1 and <= 12
            int month = 1 + (int) (Math.random() * ((12 - 1) + 1));

            // call getMonthName(int month) and pass your random int
            String monthName = getMonthName(month);

            // print the name of the month and the random int generated to the console
            System.out.println(month + " " + monthName);

        }

    }

    // Get the name for the month using the random int you generated
    public static String getMonthName(int month) {

        String monthName = "";

        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }

        return monthName;
    }
}





