package com.domRod.Dealership.java.ui;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;
//

public class DealershipLoginMenu extends AMenu{


    public void displayMenu(){

        Scanner myScanner = new Scanner(System.in);
        System.out.println(greet);
        System.out.println("\t\t\tLogin Menu.\nPlease enter the number for how you wish to login:");
        System.out.println("\t\t1:Customer");
        System.out.println("\t\t2:Employee");
        System.out.println("\tEntry:\t");
        try {

            String entry = myScanner.nextLine();
            if (entry.equals("1")){
                System.out.println("Login Customer Menu\r");
                System.out.println("Thank you, we hope you enjoy our virtual showroom and car lot\r");
                CustomerMenu custMenu1 = new CustomerMenu();
                custMenu1.displayMenu();

            } else if (entry.equals("2")){
                System.out.println("Login Employee Menu\r");
                System.out.println("Welcome valued employee, have a successful day!\r");
                EmployeeMenu empMenu1 = new EmployeeMenu();
                empMenu1.displayMenu();
            }


        } catch (InputMismatchException e){
            System.out.println("Please select either 1 or 2 from above\n"+e);

        } catch (IllegalArgumentException e){
            System.out.println("Please only enter a number 1 or 2 for above\n"+e);

        } 
    myScanner.close();

    }
}

