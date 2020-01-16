package com.company.tenbitsAssignment6;

import java.util.regex.Pattern;

public class FindValidEmail {
    public static void CheckValidEmail(String email){
        String emailValidation = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern p =  Pattern.compile(emailValidation);

        if(p.matcher(email).matches()){
            System.out.println(email + "  is Valid");

        }
        else{
            System.out.println("Please enter a valid email address!!");
        }

    }
}
