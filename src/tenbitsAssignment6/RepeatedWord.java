package com.company.tenbitsAssignment6;

public class RepeatedWord {

    public static void getNumberofWords(String  find){
        String str = "Create 2 classes parent child between vehicanle is base calas  child is sedan suv and truck and two of thos 3 child classesshould not be able to initiate a child class";
        int stringCount = 0;
            String[] StringArray = str.split(" ");

            for(String s : StringArray){
                   if(s.equals(find)) {
                        stringCount++;
                   }
            }
            System.out.println("String " + find+" was found " + stringCount + " times.");

    }
}
