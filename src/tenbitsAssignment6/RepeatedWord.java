package com.company.tenbitsAssignment6;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWord {

    public static void getNumberofWords(String input){
        String str = input;
        int stringCount = 0;
            String[] StringArray = str.split(" ");
        Map<String, Integer> checkVisitedWord = new HashMap<String, Integer>();

        for(String s : StringArray){
                if(checkVisitedWord.containsKey(s)){
                    int mostVisited = checkVisitedWord.get(s);
                    mostVisited++;
                    checkVisitedWord.put(s, mostVisited);
                }
                else {
                    checkVisitedWord.put(s, 1);
                }
        }
        int highestCount = 0;
        String res = "-1";
        for(Map.Entry<String,Integer> val : checkVisitedWord.entrySet()){
            if(highestCount < val.getValue()){
                res = val.getKey();
                highestCount = val.getValue();

            }
        }
        System.out.println(res + "  is the most Repeated Word in the given Paragraph");


    }
}


/*

            for(String s : StringArray){
                   if(s.equals(find)) {
                        stringCount++;
                   }
            }
            System.out.println("String " + find+" was found " + stringCount + " times.");
*/
