package day10.address;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Application {
    static Scanner scanner = new Scanner(System.in);
    static String FILE_PATH = "./src/main/java/day10/address/zipcode_seoul_utf8_type2.csv";

    public static void main(String[] args) throws IOException {
        addressSearch(inputAddress());
    }

    private static void addressSearch(String input) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
        Set<String> addressSet = new HashSet<>();

        searchAddress(br, input, addressSet);
        printResult(addressSet);
        continueCheck();
    }

    private static void continueCheck() throws IOException {
        System.out.println("주소를 입력해주세요 (종료하시려면 q) ");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("q")) {
                System.out.println("종료");
                System.exit(0);
            }
            if (validateInput(input)) {
                addressSearch(input);
            }
        }
    }

    private static void searchAddress(BufferedReader br, String input, Set<String> addressSet)
            throws IOException {

        String readLine = br.readLine();
        while (readLine != null) {
            String address = readLine.replaceAll(",", " ");

            if (readLine.contains(input)) {
                addressSet.add(address);
            }
            readLine = br.readLine();
        }
    }

    private static void printResult(Set<String> addressSet) {
        List<String> addressList = new ArrayList<>(addressSet);
        Collections.sort(addressList);

        for (String address : addressList) {
            System.out.println(address);
        }
        System.out.println();
    }

    private static boolean validateInput(String inputAddress) {
        if (inputAddress.length() < 2) {
            System.out.println("다시 입력해주세요");
            return false;
        }
        return true;
    }

    private static String inputAddress() {
        System.out.println("주소를 입력해주세요");

        while (true) {
            String input = scanner.nextLine();
            if (validateInput(input)) {
                return input.strip();
            }
        }
    }
}
