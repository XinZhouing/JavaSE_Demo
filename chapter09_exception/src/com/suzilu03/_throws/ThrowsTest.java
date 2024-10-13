package com.suzilu03._throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsTest {

    public static void main(String[] args) {

        try {
            method1();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void method1() throws FileNotFoundException, IOException {
        File file = new File("D://hello.txt");

        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();

        while (data != -1){
            System.out.println((char) data);
            data = fis.read();
        }
        fis.close();
    }
}
