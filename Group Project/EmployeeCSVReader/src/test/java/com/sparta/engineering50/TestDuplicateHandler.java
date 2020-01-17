package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDuplicateHandler {
    @Test
    void testThatDuplicateValueIsDetected() {
        HashMap<Integer, Employee> hashMap = new HashMap<>();
        Employee employee = new Employee(new String[]{"198429", "Mrs.", "Serafina", "I", "Bumgarner", "F", "serafina.bumgarner@exxonmobil.com", "9/21/1982", "2/1/2008", "69294"});
        hashMap.put(198429, employee);
        assertEquals(true, DuplicateHandler.isDuplicate(hashMap, 198429));
    }

    @Test
    void testThatNonDuplicateValueReturnsFalse() {
        HashMap<Integer, Employee> hashMap = new HashMap<>();
        Employee employee = new Employee(new String[]{"198429", "Mrs.", "Serafina", "I", "Bumgarner", "F", "serafina.bumgarner@exxonmobil.com", "9/21/1982", "2/1/2008", "69294"});
        hashMap.put(198429, employee);
        assertEquals(false, DuplicateHandler.isDuplicate(hashMap, 123456));
    }
}