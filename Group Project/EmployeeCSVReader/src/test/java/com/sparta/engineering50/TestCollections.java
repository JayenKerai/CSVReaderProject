package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCollections {

    @Test
    void testThatFirstNameOfFirstNameIsRight() {
        Collections collection = new Collections("src/resources/SampleEmployeeRecords.csv");
        assertEquals("Serafina", collection.getEmployee(198429).getFirstName());
    }
}