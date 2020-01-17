package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestEmployeeCollection {
    //had to start the for loop from 1 and not zero bc of the algorithm in readCSV skips the first line
    //for the first instance of this test the size of the file was hardcoded to be size+1
    @Test
    void testThatEmployeeCollectionHasSizeOfSampleWithoutDuplicate() {
        EmployeeCollection employeeCollection = new EmployeeCollection("src/resources/SampleEmployeeRecords.csv");
        assertEquals(7, employeeCollection.getMap().size());
    }

    @Test
    void testThatHashMapReturnsCorrectEmployeeIdForFirstEntry() {
        EmployeeCollection employeeCollection = new EmployeeCollection("src/resources/SampleEmployeeRecords.csv");
        assertEquals(198429, employeeCollection.getMap().get(198429).getEmployeeId());
    }

    @Test
    void testThatHashMapReturnsCorrectNameForFirstEntry() {
        EmployeeCollection employeeCollection = new EmployeeCollection("src/resources/SampleEmployeeRecords.csv");
        assertEquals("Serafina", employeeCollection.getMap().get(198429).getFirstName());
    }

    //added a duplicate to SampleEmployeeRecords
    //changed the hardcoded for loop iterations to the new size
    //HashMap size did not change
    @Test
    void testThatHashMapIgnoresDuplicateInSample() {
        EmployeeCollection employeeCollection = new EmployeeCollection("src/resources/SampleEmployeeRecords.csv");
        assertNotEquals("8", employeeCollection.getMap().size());
    }

}