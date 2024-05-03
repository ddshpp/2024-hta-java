package day2;

public class Study1 {

    public static void main(String[] args) {
        createArray();
        calculator();
        findMaxValueMinValue();
        testStringArray();
        testTwoDimensionArray();
        testObject();
    }

    private static void testObject() {
        Coffee coffee1 = new Coffee("강력한아메리카노", 1000);
        System.out.println(coffee1.getName());
        System.out.println(coffee1.getPrice());
        coffee1.hello();
        coffee1.hello2();
    }

    private static void testTwoDimensionArray() {
        String[][] arr = new String[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + " , " + j;
            }
        }

        for (String[] strings : arr) {
            for (String str : strings) {
                System.out.println(str);
            }
        }
    }

    private static void testStringArray() {
        String[] array04 = {"아이고", "아이구", "어이고"};
        for (String str : array04) {
            System.out.println(str);
        }
    }

    private static void findMaxValueMinValue() {
        int[] array03 = {100, 2, 3, 4, 5, 6, 6, 77, 888, 10, 2132};
        int min = array03[0];
        int minIndex = 0;
        int max = array03[0];
        int maxIndex = 0;

        for (int i = 0; i < array03.length; i++) {
            if (array03[i] < min) {
                min = array03[i];
                minIndex = i;
            }
            if (array03[i] > max) {
                max = array03[i];
                maxIndex = i;
            }
        }

        System.out.println("min : " + min);
        System.out.println("minIndex : " + minIndex);
        System.out.println("max : " + max);
        System.out.println("maxIndex : " + maxIndex);
    }

    private static void calculator() {
        int[] score = {100, 88, 100, 100, 90};
        int sum = 0;
        double average = 0.0;

        for (int i : score) {
            sum += i;
        }

        average = (double) sum / score.length;
        System.out.println("총 점수 : " + sum);
        System.out.println("평균 점수 : " + average);
    }

    private static void createArray() {
        // 1번
        int[] array01 = new int[3];
        array01[0] = 1;
        array01[1] = 2;
        array01[2] = 3;

        for (int i : array01) {
            System.out.println(i);
        }

        // 2번
        int[] array02 = {10, 20, 30, 40, 50};
        for (int i : array02) {
            System.out.println(i);
        }

        // 3번
        int[] array03 = new int[]{100, 200, 300};
        for (int i : array03) {
            System.out.println(i);
        }
    }
}
