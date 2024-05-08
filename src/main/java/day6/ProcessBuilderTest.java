package day6;

import java.io.IOException;

public class ProcessBuilderTest {
    public static void main(String[] args) throws IOException {

        ProcessBuilder processBuilderTest1 = new ProcessBuilder("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
//        processBuilderTest1.start();

        ProcessBuilder processBuilderTest2 = new ProcessBuilder("/Applications/KakaoTalk.app/Contents/MacOS/KakaoTalk");
//        processBuilderTest2.start();
    }
}
