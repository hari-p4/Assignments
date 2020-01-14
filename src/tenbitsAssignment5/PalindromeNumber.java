package com.company.tenbitsAssignment5;

public class PalindromeNumber {
    public static void PalNumber(int Number){

            int result = 0;
            int FinalResult = 0;
            int CheckNumber = Number;
            while (Number != 0){
                result = Number % 10;
                FinalResult = FinalResult * 10 + result;
                Number = Number / 10;
            }
            System.out.println(FinalResult);
            if(CheckNumber == FinalResult){
                System.out.println("Given is a Palindrome Number");
            }
            else{
                System.out.println("Given Number is not a Palindrome Number");
            }
    }
}
