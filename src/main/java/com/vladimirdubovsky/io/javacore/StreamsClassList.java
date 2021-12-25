package com.vladimirdubovsky.io.javacore;

import java.io.*;

public class StreamsClassList {

    public static void main(String[] args) {
    }

    public static void classesToLearn(String[] args) {
        System.out.println(File.class);

        System.out.println(InputStream.class); // Abstract
        System.out.println(FileInputStream.class); //!
        System.out.println(ByteArrayInputStream.class);
        System.out.println(FilterInputStream.class);
        System.out.println(ObjectInputStream.class);

        System.out.println(OutputStream.class); // Abstract
        System.out.println(FileOutputStream.class); //!
        System.out.println(ByteArrayOutputStream.class);
        System.out.println(FilterOutputStream.class);
        System.out.println(ObjectOutputStream.class);

        System.out.println(FilterInputStream.class);
        System.out.println(DataInputStream.class);
        System.out.println(BufferedInputStream.class);

        System.out.println(FilterOutputStream.class);
        System.out.println(DataOutputStream.class);
        System.out.println(BufferedOutputStream.class);

        System.out.println(Reader.class);
        System.out.println(Writer.class);

        System.out.println(FileWriter.class);
        System.out.println(FileReader.class);

        System.out.println(BufferedWriter.class);
        System.out.println(BufferedReader.class);
    }
}
