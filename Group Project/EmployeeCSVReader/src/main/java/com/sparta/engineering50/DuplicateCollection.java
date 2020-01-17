package com.sparta.engineering50;

/*
Finds and holds all duplicates in duplicateMap
 */
import java.util.HashMap;

public class DuplicateCollection {

    private HashMap<Integer, Employee> duplicateMap = new HashMap<>();
    private HashMap<Integer, Employee> mapWithoutDuplicates;

    public DuplicateCollection(HashMap<Integer, Employee> mapWithoutDuplicates, String path) {
        this.mapWithoutDuplicates = mapWithoutDuplicates;
        createDuplicateMap(path);
    }

    private void createDuplicateMap(String path) {
        CSVReader csvReader = new CSVReader();
        for (int i = 1; i < mapWithoutDuplicates.size(); i++) {
            if (DuplicateHandler.isDuplicate(mapWithoutDuplicates, csvReader.reader(path, i).getEmployeeId())) {
                duplicateMap.put(csvReader.reader(path, i).getEmployeeId(), csvReader.reader(path, i));
            }
        }
    }

    public HashMap<Integer, Employee> getMap() {
        return duplicateMap;
    }

}