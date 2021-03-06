package com.domRod.Dealership.java.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerMenu extends AMenu {

    public void displayMenu(){


        System.out.println(greet2);
        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("Welcome valued customer\n");
        System.out.printf("Would you like to %n(1):\tRegister as a new Customer or%n(2):\tLogin as a returning customer?:");
        System.out.println("Please enter the Option number of your choice:  (1) or (2)");

        try {

            String entry = myScanner2.nextLine();
            if (entry.equals("1")){
                System.out.println("Welcome New Customer!\r");
                System.out.println("Let's get you started....\r");


            } else if (entry.equals("2")){
                System.out.println("Welcome Back, we're happy you decided to shop with us today\r");

            }


        } catch (InputMismatchException exception){
            System.out.println("Please select either 1 or 2 from above");

        }
        myScanner2.close();

    }


public static void createNewCustomer(){}

public void customerSRVCS(){}
}
