package  Core_Java;
import java.util.*;

public class GregorianCalendar {
    public static void main(String[] args) {
        Calendar a = Calendar.getInstance();
        System.out.println(a.getTimeZone());
        System.out.println(a.getTime());

        System.out.println(a.get(Calendar.DATE));
        System.out.println(a.get(Calendar.SECOND));
        System.out.println(a.get(Calendar.HOUR));
        System.out.println(a.get(Calendar.HOUR_OF_DAY));

        java.util.GregorianCalendar cal = new java.util.GregorianCalendar();
        System.out.println(cal.isLeapYear(2029));
      //  System.out.println(cal.);
    }

}
