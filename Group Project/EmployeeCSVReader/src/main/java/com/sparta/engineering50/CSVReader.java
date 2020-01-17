package com.sparta.engineering50;

/*
Reads the desired line and creates an Employee which is returned
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public Employee reader(String path, int desiredLine) {

        //returns null if desired line is out of bounds/invalid
        if (desiredLine <= 0 || desiredLine > FileLineCounter.countNumberOfLines(path)) {
            return null;
        }

        String[] strArray = new String[10]; //array to hold information for each employee

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            reader.readLine(); //skip 1st line in csv file
            for (int i = 0; i < desiredLine - 1; i++) {
                reader.readLine(); //skip to next line, depending on desired line
            }
            strArray = reader.readLine().split(","); //read next line, split by comma, save to strArray
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Employee(strArray);
    }
}