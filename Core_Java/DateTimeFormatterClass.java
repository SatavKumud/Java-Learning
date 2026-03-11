package Core_Java;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterClass {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();  //date yha hai
      //  System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //formatting krne wala tool yha hai
//        System.out.println(df);

        DateTimeFormatter df1  = DateTimeFormatter.ISO_DATE_TIME;
        String myDate2 = dt.format(df1);
        System.out.println(myDate2);

        String myDate = dt.format(df); //pr yaha dono hai date ab format ho jayegi
        System.out.println(myDate);
    }

}
