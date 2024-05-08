package day6;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
//        System.out.println("안녕안녕");

        String[] stringArray = {"a", "b", "c", "d", "e", "f"};
        String[] stringArray2 = {"a", "b", "c", "d", "e", "f"};

        System.out.println(
                "Arrays.equals(stringArray, stringArray2) : " + Arrays.equals(stringArray,
                        stringArray2));

        int[] intArray = {1, 3, 2, 4, 6, 7, 10, 5, 9, 8};
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        int binarySearchIndex = Arrays.binarySearch(intArray, 3);
        System.out.println("binarySearchIndex : " + binarySearchIndex);
    }
}
