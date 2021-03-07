package com.domRod.Dealership.java.models;
import java.util.UUID;

public class Customer extends User {
//TODO:  Need algorithm to generate customer ID number
    private final User.userType status = User.userType.CUSTOMER;
    private UUID customerID = null;
    private String firstName = " ";
    private String lastName = " ";
    private long streetNo = 0;
    private String streetName = " ";
    private String town = " ";
    private int zipCode = 0;
    private String state = " ";
    private String username = " ";
    private String userPassword = " ";
    private String email = " ";



Customer(){ }

Customer( String first, String last){
    //paramaterized constr.
    this.firstName = first;
    this.lastName = last;
    this.customerID = createCustNoID();
}

Customer(String first, String last, String username, String userPassword){
        this.firstName = first;
        this.lastName = last;
        this.username = username;
        this.userPassword = userPassword;
        this.customerID = createCustNoID();
}

    public UUID getCustNo(){
        return customerID;
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

    public String getUsername() {return username; }

    public void setUsername(String username) {this.username = username; }

    public String getUserPassword() {return userPassword; }

    public void setUserPassword(String userPassword) {this.userPassword = userPassword; }

    public UUID createCustNoID(){
        return UUID.randomUUID();
    }
}