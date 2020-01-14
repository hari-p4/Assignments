package com.company.tenbitsAssignment5;

import java.util.HashMap;
import java.util.Map;

public class ConsequentAlpha {
    public static void  TwoAlpha(String s){
        Map<Character, Integer> map = new HashMap();
        map.put('A', 1);
        map.put('B', 2);
        map.put('C', 3);
        map.put('D', 4);
        map.put('E', 5);
        map.put('F', 6);
        map.put('I', 7);
        map.put('J', 8);
        map.put('K', 9);
        map.put('L', 10);
        map.put('M', 11);
        map.put('N', 12);
        map.put('O', 13);
        map.put('P', 14);
        map.put('Q', 15);
        map.put('R', 16);
        //FJK
        int differnece = 0;

        for(int i = 0; i <= s.length(); i++){

            if(map.get(s.charAt(i)) - map.get(s.charAt(i + 1))  < 0) {

                differnece =  map.get(s.charAt(i)) - map.get(s.charAt(i + 1));
                differnece = differnece * (-1);

                System.out.println("There least difference is " + differnece);

            }
        }

    }

}

