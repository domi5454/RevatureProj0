package com.domRod.Dealership.java.models;
import java.util.UUID;

public class Employee {
//TODO:How do I generate employee ID num?
    private final User.userType status = User.userType.EMPLOYEE;
    private UUID employeeID = null;
    private String firstName = " ";
    private String lastName = " ";
    private String userName = "";
    private String pssWrd = " ";
    private long streetNo = 0;
    private String streetName = " ";
    private String town = " ";
    private int zipCode = 0;
    private String state = " ";

    public Employee(){}

    public Employee(String first, String last){
        this.firstName = first;
        this.lastName = last;
        this.employeeID = createEmployeeID();
    }

    public User.userType getStatus() {
        return status;
    }

    public UUID getEmployeeID() {
        return employeeID;
    }

    public UUID createEmployeeID() {
            return UUID.randomUUID();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(long streetNo) {
        this.streetNo = streetNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPssWrd() {
        return pssWrd;
    }

    public void setPssWrd(String pssWrd) {
        this.pssWrd = pssWrd;
    }
}
