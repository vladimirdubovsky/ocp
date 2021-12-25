package com.vladimirdubovsky.io.javadoc;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) throws IOException {

        try (
                BufferedReader inputStream = new BufferedReader(new FileReader("xanadu.txt"));
                PrintWriter outputStream = new PrintWriter(new FileWriter("characteroutput.txt"))
        ) {
            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
        }
    }
}