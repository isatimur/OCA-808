package LocaleDates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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

        LocalDate date4 = LocalDate.parse("2014-06-14", DateTimeFormatter.ISO_DATE);
        System.out.println("date4=" + date4);

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period = Period.ofMonths(1);
        System.out.println(date.plus(period));
        System.out.println(dateTime.plus(period));
//        System.out.println(time.plus(period)); //UnsupportadTempora;TypeException

        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());


        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        System.out.println(date.format(DateTimeFormatter.ISO_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime));
        System.out.println(shortDateTime.format(date));
//        System.out.println(shortDateTime.format(time)); //UnsupportadTemporalException

        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter fullF = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter longF = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(shortF.format(dateTime));
        System.out.println(mediumF.format(dateTime));
        System.out.println(fullF.format(dateTime));
        System.out.println(longF.format(dateTime));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'время:'hh:mm - dd MMMM yyyy'г.'");
        System.out.println(formatter.format(dateTime));
    }
}
