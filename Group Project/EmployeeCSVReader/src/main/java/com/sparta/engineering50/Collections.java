package com.sparta.engineering50;

/*
Contains and manages the EmployeeCollection and DuplicateCollection
 */
public class Collections {
    private EmployeeCollection employeeCollection;
    private DuplicateCollection duplicateCollection;

    public Collections(String path) {
        this.employeeCollection = new EmployeeCollection(path);
        this.duplicateCollection = new DuplicateCollection(employeeCollection.getMap(), path);
    }

    public EmployeeCollection getEmployeeCollection() {
        return (employeeCollection);
    }

    public DuplicateCollection getDuplicateCollection() {
        return (duplicateCollection);
    }

    public Employee getEmployee(int id) {
        return (employeeCollection.getMap().get(id));
    }

}
