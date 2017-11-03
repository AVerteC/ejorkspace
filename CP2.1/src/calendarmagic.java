import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendarmagic {

        }

    public static void main (String [] args) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.add(Calendar.DAY_OF_MONTH, 100);
        int month = cal.get(Calendar.MONTH);
        int dayMonth = cal.get(Calendar.DAY_OF_MONTH);
        int dayVal = cal.get(Calendar.DAY_OF_WEEK);
        
        int year = cal.get(Calendar.YEAR);
        String wkday = daymanager(dayVal);


        System.out.println(String.format("%d / %d / %d | weekday: %s", month, dayMonth, year, wkday));

        /*
        GregorianCalendar cal2 = new GregorianCalendar();
            cal2.set(2000,3,26);
            weekday = cal2.get(Calendar.DAY_OF_WEEK);
            wkday = "";
        */


    }
    }
