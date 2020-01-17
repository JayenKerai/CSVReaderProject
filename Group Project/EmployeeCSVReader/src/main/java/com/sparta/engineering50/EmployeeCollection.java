package com.sparta.engineering50;

/*
Holds all Employees in a map, map
 */
import java.util.HashMap;

public class EmployeeCollection {
    private HashMap<Integer, Employee> map = new HashMap<>();

    public EmployeeCollection(String path) {
        readIntoMap(path);
    }

    //reads lines from csv file into map
    private void readIntoMap(String path) {
        FileLineCounter.setNumberOfLines(0); //so that it initialises the counter to zero before loop
        CSVReader csvReader = new CSVReader();
        for (int i = 1; i < FileLineCounter.countNumberOfLines(path); i++) {
            map.put(csvReader.reader(path, i).getEmployeeId(), csvReader.reader(path, i));
            FileLineCounter.setNumberOfLines(0); //set line counter back to zero
        }
    }

    public HashMap<Integer, Employee> getMap() {
        return map;
    }
}