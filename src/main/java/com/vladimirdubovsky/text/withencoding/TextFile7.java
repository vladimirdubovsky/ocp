package com.vladimirdubovsky.text.withencoding;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class TextFile7 {
    public static void main(String[] args) {
        final String fileName = "src/main/java/text.txt";
        List<String> list = readListWithEncoding(fileName);
        list.forEach(System.out::println);
    }

    private static List<String> readListWithEncoding(String fileName) {
        List<String> result = new ArrayList<>();
        try (
                FileInputStream fr = new FileInputStream(fileName);
                InputStreamReader is = new InputStreamReader(fr, Charset.forName("cp1251"));
                BufferedReader br = new BufferedReader(is)
        ) { // Buffered reader 8192 symbols
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
