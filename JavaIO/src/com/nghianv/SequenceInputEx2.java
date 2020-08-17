package com.nghianv;

import java.io.*;

public class SequenceInputEx2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin1 = null;
        FileInputStream fin2 = null;
        FileOutputStream fout = null;
        SequenceInputStream sis = null;
        try {
            fin1 = new FileInputStream("/home/nghianv/input1.txt");
            fin2 = new FileInputStream("/home/nghianv/input2.txt");
            fout = new FileOutputStream("/home/nghianv/output1.txt");
            sis = new SequenceInputStream(fin1, fin2);
            int i;
            while ((i = sis.read()) != -1) {
                fout.write(i);
            }
            System.out.println("Success...");
            sis.close();
            fout.close();
            fin1.close();
            fin2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            sis.close();
            fout.close();
            fin1.close();
            fin2.close();
        }
    }
}
