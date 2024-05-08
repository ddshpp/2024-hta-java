package day6.stringTokenizerTest;

import java.util.StringTokenizer;

public class Application {
    public static void main(String[] args) {
        System.out.println("하이하이!");

        StringTokenizer st = new StringTokenizer("Hello World");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextElement());
        }
    }
}
