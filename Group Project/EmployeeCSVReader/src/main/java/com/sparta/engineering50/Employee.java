package com.sparta.engineering50;

/*
Model for an employee, containing all fields
 */
public class Employee {
    private int employeeId;
    private String namePrefix;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String gender;
    private String emailAddress;
    private String dateOfBirth;
    private String dateOfJoining;
    private int salary;

    public Employee(String[] employeeDetails) {
        this.employeeId = Integer.parseInt(employeeDetails[0]);
        this.namePrefix = employeeDetails[1];
        this.firstName = employeeDetails[2];
        this.middleInitial = employeeDetails[3];
        this.lastName = employeeDetails[4];
        this.gender = employeeDetails[5];
        this.emailAddress = employeeDetails[6];
        this.dateOfBirth = employeeDetails[7];
        this.dateOfJoining = employeeDetails[8];
        this.salary = Integer.parseInt(employeeDetails[9]);
    }

    public int getEmployeeId() {
        return (employeeId);
    }

    public String getNamePrefix() {
        return (namePrefix);
    }

    public String getFirstName() {
        return (firstName);
    }

    public String getMiddleInitial() {
        return (middleInitial);
    }

    public String getLastName() {
        return (lastName);
    }

    public String getGender() {
        return (gender);
    }

    public String getEmailAddress() {
        return (emailAddress);
    }

    public String getDateOfBirth() {
        return (dateOfBirth);
    }

    public String getDateOfJoining() {
        return (dateOfJoining);
    }

    public int getSalary() {
        return (salary);
    }

    @Override
    public String toString() {
        return "Employee {" +
                "employeeId = " + employeeId +
                ", namePrefix = " + namePrefix +
                ", firstName = " + firstName +
                ", middleInitial = " + middleInitial +
                ", lastName = " + lastName +
                ", gender = " + gender +
                ", emailAddress = " + emailAddress +
                ", dateOfBirth = " + dateOfBirth +
                ", dateOfJoining = " + dateOfJoining +
                ", salary = " + salary +
                '}';
    }
}
