package com.domRod.Dealership.java.services;
import com.domRod.Dealership.java.models.Employee;
import com.domRod.Dealership.java.models.Car;
import com.domRod.Dealership.java.models.Customer;

import com.domRod.Dealership.java.models.Car;

public class PaymentSrvcs {
    public class CarPayment{
        protected Car car;
        protected float[] payments;

        CarPayment(){
            this.payments = new float[60];
        }

    }



    public CarPayment viewPayments(Car car){
        CarPayment invoice = new CarPayment();
       invoice.car = car;
       return invoice;
    }

    public CarPayment[]  viewCustomerPaymts(Customer customer, Car[] car){
        CarPayment[] invoices = new CarPayment[];

    }
}
