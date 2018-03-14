package part_03;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Calendar;
import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = totalMilliseconds/1000;

        // Get the current second within the minute within the hour
        long currentSec = totalSeconds%60;

        // Get total minutes

        long totalMins = totalSeconds/60;

        // Get the current minute in the hour

        long currentMin = totalMins%60;

        // Get the total hours

        long totalHours = totalMins/60;

        // Get the current hour

        long currentHour = (totalHours + timeZoneChange)%24;

        // Display results using a 12 hour clock, include AM or PM

        // currentHour += timeZoneChange;

        if (currentHour > 12) {
            currentHour -= 12;
            System.out.println(currentHour + ":" + currentMin + ":" + currentSec + "PM");
        }
        else if (currentHour == 0){
            currentHour += 12;
            System.out.println(currentHour + ":" + currentMin + ":" + currentSec + "AM");
        }
        else {
            System.out.println(currentHour + ":" + currentMin + ":" + currentSec + "AM");
        }
    }
}

