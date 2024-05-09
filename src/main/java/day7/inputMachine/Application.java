package day7.inputMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        System.out.println("입력해보셈");
        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            System.out.println("입력값 : " + st.nextToken());
            st = new StringTokenizer(br.readLine());
        }
    }
}
