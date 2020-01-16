package com.compa
ny.tenbitsAssignment5;

public class timesWordCount {
    public static void WordCount(String sentence, String findThis){
        int finalWordCount = 0;
            String[] splitArray = sentence.split(" ");

            for(String s : splitArray){
                if(s.equals(findThis)){
                    finalWordCount++;
                }
            }


   System.out.println(finalWordCount);
    }
}
