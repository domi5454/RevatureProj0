package com.domRod.Dealership.java.ui;
import com.domRod.Dealership.java.models.Customer;
import com.domRod.Dealership.java.services.CustSrvcs;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerMenu extends AMenu {

    public void displayMenu(){


        System.out.println(greet2);
        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("Welcome valued customer\n");
        System.out.printf("Would you like to %n(1):\tRegister as a new Customer or\n(2):\tLogin as a returning customer?:");
        System.out.println("\n\n\t\tPlease enter the Option number of your choice:  (1) or (2)");

        try {

            String entry = myScanner2.nextLine();
            if (entry.equals("1")){
                System.out.println("Welcome New Customer!\r");
                System.out.println("Let's get you started....\r");
                createNewCustomer();


            } else if (entry.equals("2")){
                System.out.println("Welcome Back, we're happy you decided to shop with us today\r");

            }


        } catch (InputMismatchException exception){
            System.out.println("Please select either 1 or 2 from above");

        }
        myScanner2.close();

    }


public static void createNewCustomer(){
        Scanner custScan = new Scanner(System.in);
        try {
            System.out.println("First Name:  ");
            String entry = custScan.nextLine();


            Customer newCustomer1 = new Customer();
        }catch
}

public void customerSRVCS(){}
}
