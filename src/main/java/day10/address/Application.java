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
        addressSearch();
    }

    private static void addressSearch() throws IOException {
        System.out.println("주소를 입력해주세요");
        String input = validateInput();

        BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
        String readLine = br.readLine();

        Set<String> addressSet = new HashSet<>();

//        countCheck(readLine, addressSet, br);

        while (readLine != null) {
            String address = readLine.replaceAll(",", " ");
            String[] addressSplits = readLine.split(",");

            if (addressSplits[2].contains(input)) {
                addressSet.add(address);
            }
            if (addressSplits[3].contains(input)) {
                addressSet.add(address);
            }

            readLine = br.readLine();
        }

        List<String> addressList = new ArrayList<>(addressSet);
        Collections.sort(addressList);

        for (String address : addressList) {
            System.out.println(address);
        }
    }

    private static void countCheck(String readLine, Set<String> addressSet, BufferedReader br)
            throws IOException {
        int count = 0;

        while (readLine != null) {
            addressSet.add(readLine);
            count++;
            readLine = br.readLine();
        }

        System.out.println(addressSet.size());
        System.out.println(count);
    }

    private static String validateInput() {
        String input = scanner.nextLine();

        while (input.length() < 2) {
            System.out.println("다시 입력해주세요");
            input = scanner.nextLine();
        }
        return input;
    }
}
