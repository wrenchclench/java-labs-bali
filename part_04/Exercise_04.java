package part_04;

/**
 *
 */

class Exercise_04 {
    public static void main(String[] args) {
        int min,max;
        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };
        // uncomment the lines below when your methods are ready
//        System.out.println(getMaxVal(dataArray));
//        System.out.println(getMinVal(dataArray));

        min = max = 0;
        // check for min and max

        static int getMaxVal() {
            for (int i = 0; i < dataArray.length; i++) {
                for (int j = 0; j < dataArray.length; j++){

                }
            }
        }
        // print out min and max
        System.out.println("min and max: " + min + " " + max);
    }

    // write a method called getMaxVal that takes in a 2D array and iterates through the array to determine the max value in array

    // write a method called getMinVal that takes in a 2D array and iterates through the array to determine the min value in array

}