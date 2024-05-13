package day9.format;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        simpleDateFormatTest();
    }

    private static void simpleDateFormatTest() {
        Date today = new Date();

        List<SimpleDateFormat> dateFormats = new ArrayList<>();
        dateFormats.add(new SimpleDateFormat("yyyy-MM-dd"));
        dateFormats.add(new SimpleDateFormat("''yy년 MMM dd일 E요일"));
        dateFormats.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"));
        dateFormats.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a"));
        dateFormats.add(new SimpleDateFormat("오늘은 올 해의 D번째 날"));
        dateFormats.add(new SimpleDateFormat("오늘은 이 달의 d번째 날"));
        dateFormats.add(new SimpleDateFormat("오늘은 올 해의 w번째 주"));
        dateFormats.add(new SimpleDateFormat("오늘은 이 달의 W번째 주"));
        dateFormats.add(new SimpleDateFormat("오늘은 이 달의 F번째 E요일"));

        for (SimpleDateFormat dateFormat : dateFormats) {
            System.out.println(dateFormat.format(today));
        }
    }
}
