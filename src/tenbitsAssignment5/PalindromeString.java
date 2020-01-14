package com.company.tenbitsAssignment5;

public class PalindromeString {
    public static void PalString(String str){
        String checkStr = str;
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0 ; i--){
            sb = sb.append(str.charAt(i));
        }
        if(sb.toString().equals(checkStr)){
            System.out.println("Given String is Palindrom " +sb);
        }
        else {
            System.out.println("Given String is  NOT Palindrom" );
        }

    }


}
