package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCSVReader {
    //test used to test csvReader before the second parameter was implemented
    /*@Test
    void testThatEmployee198429HasFirstNameSerafina() {
        Employee Serafina = new Employee(new String[] {"198429","Mrs.","Serafina","I","Bumgarner","F","serafina.bumgarner@exxonmobil.com","9/21/1982","2/1/2008","69294"});
        assertEquals("Serafina", CSVReader.csvReader("src/resources/EmployeeRecords.csv).getFirstName());
    }
*/
    CSVReader csvReader = new CSVReader();

    @Test
    void testThatEmployeeFourHasFirstNameElmer() {
        assertEquals("Elmer", csvReader.reader("src/resources/EmployeeRecords.csv", 4).getFirstName());
    }

    @Test
    void testThatDateOfBirthOfEmployeeEight() {
        assertEquals("8/13/1991", csvReader.reader("src/resources/EmployeeRecords.csv", 8).getDateOfBirth());
    }

    @Test
    void testThatEmployee102HasEmployeeId381129() {
        assertEquals(381129, csvReader.reader("src/resources/EmployeeRecords.csv", 102).getEmployeeId());
    }

    @Test
    void testThatEmployeeTenHasSalary87148() {
        assertEquals(87148, csvReader.reader("src/resources/EmployeeRecords.csv", 10).getSalary());
    }

    @Test
    void testThatEmployee65499HasSalary190296() {
        assertEquals(190296, csvReader.reader("src/resources/EmployeeRecordsLarge.csv", 65499).getSalary());
    }

    @Test
    void testCSVReaderReturnsNullForInputZero() {
        assertEquals(null, csvReader.reader("src/resources/EmployeeRecords.csv", 0));
    }

    @Test
    void testCSVReaderReturnsNullForInputIntMax() {
        assertEquals(null, csvReader.reader("src/resources/EmployeeRecords.csv", (int) Integer.MAX_VALUE));
    }

    @Test
    void testCSVReaderReturnsNullForInputMinusFour() {
        assertEquals(null, csvReader.reader("src/resources/EmployeeRecords.csv", (int) Integer.MAX_VALUE));
    }

    //gender
    @Test
    void testThatEmployeeInTheThirdLineHasGenderMale() {
        assertEquals("M", csvReader.reader("src/resources/EmployeeRecords.csv", 3).getGender());
    }

    //middle
    @Test
    void testThatEmployeeInSecondLineHasEmployeeMiddleInitialM() {
        assertEquals("M", csvReader.reader("src/resources/EmployeeRecords.csv", 2).getMiddleInitial());
    }

    //lastname
    @Test
    void testThatEmployeeInLine39HasEmployeeLastName() {
        assertEquals("Owen", csvReader.reader("src/resources/EmployeeRecords.csv", 39).getLastName());
    }

    //prefix
    @Test
    void testThatEmployeeInLine42HasPrefixDr() {
        assertEquals("Dr.", csvReader.reader("src/resources/EmployeeRecords.csv", 42).getNamePrefix());
    }

    //email
    @Test
    void testThatEmployeeInLine42HasRightEmail() {
        assertEquals("bernard.bradshaw@yahoo.co.uk", csvReader.reader("src/resources/EmployeeRecords.csv", 42).getEmailAddress());
    }

    //date of join
    @Test
    void testThatEmployeeInLine10HasRightDateOfJoin() {
        assertEquals("11/2/2016", csvReader.reader("src/resources/EmployeeRecords.csv", 10).getDateOfJoining());
    }

}