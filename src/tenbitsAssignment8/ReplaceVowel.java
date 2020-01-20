package com.company.tenbitsAssignment8;

public class ReplaceVowel {
    public static void vowelwithA(String s){


            char ch[] = s.toCharArray();
            for (int i = 0; i < ch.length; i++)
            {
                if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
                {
                    ch[i]='a';
                }
            }

            for (int i = 0; i < ch.length; i++) {
                System.out.print("All the vowels replaced with A  " + ch[i]);
            }
    }
}


