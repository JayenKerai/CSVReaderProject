package com.sparta.engineering50;

/*
Manages the duplicates to return a full map without duplicate values
 */
import java.util.HashMap;

public class DuplicateHandler {
    public static boolean isDuplicate(HashMap<Integer, Employee> mapWithoutDuplicates, Integer employeeID) {
        return (mapWithoutDuplicates.containsKey(employeeID));
    }

}