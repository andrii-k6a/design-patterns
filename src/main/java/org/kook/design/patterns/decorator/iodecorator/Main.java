package org.kook.design.patterns.decorator.iodecorator;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    private static final String FILE_PATH = "file.txt";

    public static void main(String[] args) {
        try (LowerCaseInputStream inputStream = new LowerCaseInputStream(new FileInputStream(FILE_PATH))) {
            StringBuilder result = new StringBuilder();

            int read = inputStream.read();
            while (read != -1) {
                result.append(Character.valueOf((char) read));
                read = inputStream.read();
            }

            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
