package com.domRod.Dealership.java.services;
import com.domRod.Dealership.java.models.Car;
import com.domRod.Dealership.java.models.Employee;
import com.domRod.Dealership.java.services.PaymentSrvcs;

public class CarSrvcs {

    //car array
    private static Car[] carLot = new Car[500];



    public void addCar(Car car){
        System.out.println("Please input car VIM:");
        for (int i = 0; i < carLot.length;i++){
            if (carLot[i] == null){
                carLot[i] = car;
            }
        }
    }

    public void dropCar(Car car){
        System.out.println("Please enter car ");
        for (int i = 0; i < carLot.length;i++) {
            if (carLot[i] == car) {
                carLot[i] = null;
            }
        }
    }


}


