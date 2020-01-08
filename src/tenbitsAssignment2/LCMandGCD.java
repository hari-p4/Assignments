package com.company.tenbitsAssignment2;

public class Test {
    public static void Number(int a , int b){
        int gcd = 0, lcm, deno, nume, rem;

        if(a < b){
            nume = b;
            deno = a;
        }
        else{
            nume = a;
            deno = b;
        }
        if (nume % deno == 0){
            gcd = deno;
        }
        else {
            rem = nume % deno;
            gcd = rem;
        }
        lcm = (a * b) / gcd;
        System.out.println("LCM : " +lcm+ " GCD : "+gcd );
    }

}
