package day6;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(45)+1);
    }
}
