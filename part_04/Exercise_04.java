package part_04;

/**
 *
 */

class Exercise_04 {
    public static void main(String[] args) {

        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };
        // uncomment the lines below when your methods are ready
        System.out.println(getMaxVal(dataArray));
        System.out.println(getMinVal(dataArray));
    }

    // write a method called getMaxVal that takes in a 2D array and iterates through the array to determine the max value in array

    static int getMaxVal(int[][] dataArray) {

        int max = dataArray[0][0];

        // check for min and max
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray[i].length; j++) {
                if (dataArray[i][j] > max) max = dataArray[i][j];

            }

        }
        return max;
    }


    // write a method called getMinVal that takes in a 2D array and iterates through the array to determine the min value in array
    static int getMinVal(int[][] dataArray) {

        int min = dataArray[0][0];

        // check for min and max
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray[i].length; j++) {
                if (dataArray[i][j] < min) min = dataArray[i][j];


            }
        }
        return min;
    }
}


