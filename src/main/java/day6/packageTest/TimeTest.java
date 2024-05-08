package day6.packageTest;

import java.time.LocalDate;

public class TimeTest {
    public static void main(String[] args) {
        System.out.println("하이하이");

        System.out.println(System.nanoTime());
        System.out.println(System.currentTimeMillis());

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate : " + localDate);

        long nanoTime1 = System.nanoTime();
        long nanoTime2 = System.nanoTime();
        System.out.println(nanoTime2 - nanoTime1);
    }
}
