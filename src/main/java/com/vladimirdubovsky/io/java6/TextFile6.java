package com.vladimirdubovsky.io.java6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFile6 {
    public static void main(String[] args) {
        final String fileName = "src/main/java/text.txt";
        List<String> list = readList6(fileName);
    }

    private static List<String> readList6(String fileName) {
        List<String> result = new ArrayList<>();
        try { // Buffered reader 8192 symbols
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            try {
                String line;
                while ((line = br.readLine()) != null) {
                    result.add(line);
                }
            } finally {
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
