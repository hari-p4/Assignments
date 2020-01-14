package com.tenbits.bank;
import com.tenbits.bank.ConncectionClass;
import java.util.Scanner;
import sun.plugin.net.protocol.jar.CachedJarURLConnection;

public class DepositMoney {
        public static void Deposit(){
            Scanner UserId = new Scanner(System.in);
            String userid;
            System.out.println("Enter Your Account ID: ");
            userid = UserId.nextLine();

            Scanner Balance = new Scanner(System.in);
            String balance;
            System.out.println(" Enter the amount of money you want to deposit: ");
            balance = Balance.nextLine();

            String accountBal = "insert into accountdetails (UserId , Balance) values('" +userid+ "', '$" +balance+ "')";
            ConncectionClass.connect(accountBal);
        }
}
