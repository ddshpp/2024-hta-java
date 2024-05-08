package day6.javaPackages;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        int date1 = date.getDate();
        int date2 = date.getYear();

        System.out.println("getDate : " + date1);
        System.out.println("getYear : " + date2);
    }
}
