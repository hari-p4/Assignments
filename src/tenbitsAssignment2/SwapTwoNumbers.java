package com.company.tenbitsAssignment2;

public class SwapTwoNumbers {

    public static void Swap(int a, int b){
         a = a * b;
         b = a / b;
         a = b;
            System.out.println( "a : " +a+ " and b :"+b);
    }
}
