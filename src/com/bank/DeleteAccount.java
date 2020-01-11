package com.tenbits.bank;

import java.util.Scanner;

public class DeleteAccount {
        public static void DelAcc(){
            Scanner FirstName = new Scanner(System.in);
            String firstname;
            System.out.println("Please varify your FirstName before deleting : ");
            firstname = FirstName.nextLine();

            String deleteaccQ = "DELETE from accountusers WHERE FirstName = '" + firstname + "'";
            ConncectionClass.connect(deleteaccQ);
        }

}
