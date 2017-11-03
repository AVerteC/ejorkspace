import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendarmagic {
    private static String dayEdit(int weekday)
    {
        String wkday;

        if (weekday == 1) {
            wkday = "Sunday";
            return wkday;
        }

        if (weekday == 2) {
            wkday = "Monday";
            return wkday;
        }

        if (weekday == 3) {
            wkday = "Tuesday";
            return wkday;
        }

        if (weekday == 4) {
            wkday = "Wednesday";
            return wkday;
        }

        if (weekday == 5) {
            wkday = "Thursday";
            return wkday;
        }

        if (weekday == 6) {
            wkday = "Friday";
            return wkday;
        }

        if (weekday == 7) {
            wkday = "Saturday";
            return wkday;
        }
        else
            return "s";
    }



    public static void main (String [] args) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.add(Calendar.DAY_OF_MONTH, 100);
        int month = cal.get(Calendar.MONTH);
        int dayMonth = cal.get(Calendar.DAY_OF_MONTH);
        int dayVal = cal.get(Calendar.DAY_OF_WEEK);
        int year = cal.get(Calendar.YEAR);
        String wkday = dayEdit(dayVal);


        System.out.println(String.format("%d / %d / %d | weekday: %s", month, dayMonth, year, wkday));


        GregorianCalendar cal2 = new GregorianCalendar();
        cal2.set(2000,3,26);
        dayVal = cal2.get(Calendar.DAY_OF_WEEK);
        wkday = dayEdit(dayVal);
        System.out.println(String.format("The day of my birthday is %s",wkday));
        cal.add(Calendar.DAY_OF_MONTH, 1000);
        System.out.println(String.format("1000 days from my birthday is %d / %d / %d", month, dayMonth, year));


    }
    }
