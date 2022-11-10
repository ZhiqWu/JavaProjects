package com.uu;

import java.io.FileReader;

public class Test04 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("D:/a.txt");) {
            char c = (char) reader.read();
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
