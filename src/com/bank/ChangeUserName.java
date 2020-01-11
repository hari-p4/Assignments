package com.tenbits.bank;

import java.util.Scanner;

public class ChangeUserName {
    public  static void ChangeName(){

        Scanner FirstName = new Scanner(System.in);
        String firstname;
        System.out.println("Enter Your FirstName for the Account: ");
        firstname = FirstName.nextLine();

        Scanner NewFirstName = new Scanner(System.in);
        String newfirstname;
        System.out.println("Enter New name you want to update: ");
        newfirstname = NewFirstName.nextLine();

        String newname = "UPDATE accountusers set FirstName = '" + newfirstname +
                "' WHERE FirstName = '" +firstname+ "'";
        ConncectionClass.connect(newname);

    }
}

