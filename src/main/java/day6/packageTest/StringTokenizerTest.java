package day6.packageTest;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        System.out.println("하이하이!");

        StringTokenizer st = new StringTokenizer("Hello World");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextElement());
        }
    }
}
