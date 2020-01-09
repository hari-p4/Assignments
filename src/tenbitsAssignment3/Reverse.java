package com.company.tenbitsAssignment3;

public class Reverse {
    public void Result (int number){
        int rev;
        while (number > 0){
            rev = number % 10;
            System.out.println(rev);
            number = number / 10;
        }
    }
}
