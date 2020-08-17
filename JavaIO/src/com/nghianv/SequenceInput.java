package com.nghianv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInput {
    public static void main(String[] args) throws IOException {
        FileInputStream input1 = null;
        FileInputStream input2 = null;
        SequenceInputStream sqInput = null;
        try {
            input1 = new FileInputStream("/home/nghianv/input1.txt");
            input2 = new FileInputStream("/home/nghianv/input2.txt");
            sqInput = new SequenceInputStream(input1, input2);
            int i;
            while ((i = sqInput.read()) != -1) {
                System.out.print((char) i);
            }
            sqInput.close();
            input1.close();
            input2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            sqInput.close();
            input1.close();
            input2.close();
        }

    }
}
