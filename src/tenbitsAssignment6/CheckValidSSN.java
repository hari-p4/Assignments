package com.company.tenbitsAssignment6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidSSN {
    public static void FindValidSSN(String ssn){
        String SSNPatternRegex = "(\\d{3})[- ]?(\\d{2})[- ]?(\\d{4})$";


        Pattern ssnpattern = Pattern.compile(SSNPatternRegex);

        if(ssnpattern.matcher(ssn).matches()){
            System.out.println(ssn +"  is Valid");
        }
        else{
            System.out.println("pleasr provide valid SSN");
        }

    }
}
