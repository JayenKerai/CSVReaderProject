package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFileLineCounter {
    @Test
    void testToCheckIfTheWholeFileIsBeingRead() {
        assertEquals(10001, FileLineCounter.countNumberOfLines("src/resources/EmployeeRecords.csv"));
    }
}
