package com.tenbits.bank;

import java.util.Scanner;

public class CheckBalance {
    public static void Check(){
        Scanner UserId = new Scanner(System.in);
        String userid;
        System.out.println("Enter Your Account ID: ");
        userid = UserId.nextLine();

        String checkbal = " select Balance from accountdetails where UserId = "+ userid +";";
        ConncectionClass.connect(checkbal);
    }
}
