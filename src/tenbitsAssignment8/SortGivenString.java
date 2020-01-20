package com.company.tenbitsAssignment8;

import java.util.Arrays;

public class SortGivenString {

    public static void sortString(String word){
        char[] startsort = word.toCharArray();
        Arrays.sort(startsort);
        String sortedword = null;
        System.out.println(new String(startsort));
    }
}
