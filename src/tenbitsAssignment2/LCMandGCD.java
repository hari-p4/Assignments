package com.company.tenbitsAssignment2;

public class LCMandGCD{

    public static void Find(int a, int b)
    {
        int gcd, lcm, remainder, numerator, denominator;
        if (a > b)
        {
            numerator = a;
            denominator = b;
        }
        else
        {
            numerator = b;
            denominator = a;
        }
        remainder = numerator % denominator;
        while(remainder != 0)
        {
            numerator = denominator;
            denominator = remainder;
            remainder = numerator%denominator;
        }
        gcd = denominator;
        lcm = a * b / gcd;
        System.out.println("GCD of "+a+" and "+b+" = "+gcd);
        System.out.println("LCM of "+a+" and "+b+" = "+lcm);
    }

}

