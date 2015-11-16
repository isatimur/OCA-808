package LocaleDates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by Тимакс on 17.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, 06, 14);
        LocalDate date3 = LocalDate.parse("2014-06-14", DateTimeFormatter.ISO_DATE);
        System.out.println("date1=" + date1);
        System.out.println("date2=" + date2);
        System.out.println("date3=" + date3);
    }
}
