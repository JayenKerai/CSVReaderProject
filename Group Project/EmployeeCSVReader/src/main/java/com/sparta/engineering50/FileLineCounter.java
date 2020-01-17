package com.sparta.engineering50;

/*
Counts the number of lines in the file given to countNumberOfLines
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineCounter {
    private static int numberOfLines = 0;

    public static int countNumberOfLines(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.readLine() != null) {
                numberOfLines++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberOfLines;
    }

    public static int getNumberOfLines() {
        return numberOfLines;
    }

    public static void setNumberOfLines(int numberOfLines) {
        FileLineCounter.numberOfLines = numberOfLines;
    }
}