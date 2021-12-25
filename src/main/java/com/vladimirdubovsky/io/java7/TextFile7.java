package com.vladimirdubovsky.io.java7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TextFile7 {
    public static void main(String[] args) {
        final String fileName = "src/main/java/text.txt";
        List<String> list = readList7(fileName);
        List<String> fileList = readListFiles(fileName);

        list.forEach(System.out::println);
        fileList.forEach(System.out::println);
    }

    private static List<String> readList7(String fileName) {
        List<String> result = new ArrayList<>();
        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) { // Buffered reader 8192 symbols
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static List<String> readListFiles(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
