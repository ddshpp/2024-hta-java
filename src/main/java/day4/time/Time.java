package day4.time;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public void getTime() {
        System.out.println("hour : " + hour);
        System.out.println("minute : " + minute);
        System.out.println("second : " + second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            this.hour = 0;
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            this.minute = 0;
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            this.second = 0;
            return;
        }
        this.second = second;
    }
}
