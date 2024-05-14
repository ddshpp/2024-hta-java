package day10.address;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SaveAddress {
    static Scanner scanner = new Scanner(System.in);
    static String FILE_PATH = "src/main/java/day10/address/zipcode_seoul_utf8_type2.csv";
    static String SAVE_FILE_PATH = "src/main/java/day10/address/result.txt";

    public static void main(String[] args) throws IOException {
        List<String> addressList = searchResults(inputAddress());
        saveResult(addressList);
    }

    private static void saveResult(List<String> addressList) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(SAVE_FILE_PATH));

        for (String address : addressList) {
            bw.append(address);
            bw.append(System.lineSeparator());
        }
        bw.close();
    }

    private static List<String> searchResults(String input) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
        Set<String> addressSet = new HashSet<>();

        String readLine = br.readLine();
        while (readLine != null) {
            String address = readLine.replaceAll(",", " ");

            if (readLine.contains(input)) {
                addressSet.add(address);
            }
            readLine = br.readLine();
        }

        List<String> addressList = new ArrayList<>(addressSet);
        Collections.sort(addressList);
        return addressList;
    }

    private static String inputAddress() {
        System.out.println("주소를 입력하세요");
        return scanner.nextLine();
    }
}
