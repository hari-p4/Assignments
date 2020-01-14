package com.tenbits.bank;
import com.tenbits.bank.ConncectionClass;
import java.util.Scanner;
import sun.plugin.net.protocol.jar.CachedJarURLConnection;

import java.sql.*;

public class CreateAccount {
        public  static void NewAccount() {

            // Getting Input From User For Account Careation:
            Scanner FirstName = new Scanner(System.in);
            String firstname;
            System.out.println("Enter Your FirstName for the Account: ");
            firstname = FirstName.nextLine();

            Scanner SSN = new Scanner(System.in);
            String ssn;
            System.out.println("Enter Your 9 digit(s) Social Security Number : ");
            ssn = SSN.nextLine();

            String newaccountQ = "insert into accountusers (FirstName , SSN) values('" +firstname+ "', '" +ssn+ "')";
            ConncectionClass.connect(newaccountQ);
        }

}

