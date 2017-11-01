import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendarmagic {
    public static void main (String [] args) {
        GregorianCalendar cal = new GregorianCalendar();

        cal.add(Calendar.DAY_OF_MONTH, 100);
        int month = cal.get(Calendar.MONTH);
        int dayMonth = cal.get(Calendar.DAY_OF_MONTH);
        int weekday = cal.get(Calendar.DAY_OF_WEEK);
        int year = cal.get(Calendar.YEAR);
        String wkday = "";

        if(weekday == 1)
        {
            wkday = "Sunday";
        }

        if(weekday == 2)
        {
            wkday = "Monday";
        }

        if(weekday == 3)
        {
            wkday = "Tuesday";
        }

        if(weekday == 4)
        {
            wkday = "Wednesday";
        }

        if(weekday == 5)
        {
            wkday = "Thursday";
        }

        if(weekday == 6)
        {
            wkday = "Friday";
        }

        if(weekday == 7)
        {
            wkday = "Saturday";
        }
        System.out.println(String.format("%d / %d / %d | weekday: %s", month, dayMonth, year, wkday));


        GregorianCalendar cal2 = new GregorianCalendar();
            cal2.set(2000,3,26);
            int weekday2 = cal.get(Calendar.DAY_OF_WEEK);
            String wkday2 = "";

        if(weekday == 1)
        {
            wkday = "Sunday";
        }

        if(weekday == 2)
        {
            wkday = "Monday";
        }

        if(weekday == 3)
        {
            wkday = "Tuesday";
        }

        if(weekday == 4)
        {
            wkday = "Wednesday";
        }

        if(weekday == 5)
        {
            wkday = "Thursday";
        }

        if(weekday == 6)
        {
            wkday = "Friday";
        }

        if(weekday == 7)
        {
            wkday = "Saturday";
        }



    }
    }
