package day6;

import java.io.IOException;

public class ProcessBuilderTest {
    public static void main(String[] args) throws IOException {

        ProcessBuilder processBuilderTest = new ProcessBuilder("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        processBuilderTest.start();
    }
}
