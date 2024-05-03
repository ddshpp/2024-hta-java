package day3;

public class Test1 {

    public static void main(String[] args) {
        StrongMan strongMan1 = new StrongMan("이순신", 150, 180000, 22000, 1500);
        StrongMan strongMan2 = new StrongMan("일론머스크", 60, 22000, 19000, 25000);
        StrongMan strongMan3 = new StrongMan("주커버그", 110, 18000, 32000, 7000);

        StrongMan[] strongMans = {strongMan1, strongMan2, strongMan3};

        for (StrongMan strongMan : strongMans) {
            strongMan.getInfo();
        }
    }
}
