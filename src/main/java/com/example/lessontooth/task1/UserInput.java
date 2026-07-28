package com.example.lessontooth.task1;

import java.util.Scanner;

public class UserInput {

    public void userName(){

        Scanner myObj = new Scanner(System.in);
        String userName;
        // Enter username and press Enter

        System.out.println("Enter username");
        userName = myObj.nextLine();

        System.out.println("Username is: " + userName);

        System.out.println("Enter street");
        String street = myObj.nextLine();
    }
}
