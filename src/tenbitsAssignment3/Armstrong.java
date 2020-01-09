package com.company.tenbitsAssignment3;

public class Armstrong {
    public  static void FindArmstrongNumber(int n) {
            int rem, result = 0, amount = n, p = 0;
            int check = amount;
            do{
                n = n / 10;
                p++;
            }while(n != 0);
            while(amount != 0){
                rem = amount % 10;
                result += Math.pow(rem , p);
                amount = amount / 10;
            }
            if(result == check){
                System.out.println(result + " is an Armstrong Number");
            }
            else {
                System.out.println(check + " is NOT an Armstrong Number");

            }



    }
}
