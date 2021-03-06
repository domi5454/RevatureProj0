package com.domRod.Dealership.java.models;




public class Car {
    private final Vehicle.VehicleType vehicle = Vehicle.VehicleType.CAR;
    private Vehicle.VehicleMake make = null;
    private String model = null;
    private int year = 9999;
    private Vehicle.VehicleCondition condition = null;
    private String color = " ";
    //Question:  do I need to make the VIN final as well?
    private String vin = " ";

    public  Car(){}


    public Car(int year, Vehicle.VehicleCondition condition) {
        this.year = year;
        this.condition = condition;
    }

    public Car(Vehicle.VehicleMake make, String model, int year, Vehicle.VehicleCondition condition, String color, String vin) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.condition = condition;
        this.color = color;
        this.vin = vin;
    }

    public Vehicle.VehicleType getVehicle() {
        return vehicle;
    }

    public Vehicle.VehicleMake getMake() {
        return make;
    }

    public void setMake(Vehicle.VehicleMake make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Vehicle.VehicleCondition getCondition() {
        return condition;
    }

    public void setCondition(Vehicle.VehicleCondition condition) {
        this.condition = condition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}



