package Core_Java;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
       // System.out.println(d.after());
    }
}

