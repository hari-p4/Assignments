package com.company.tenbitsAssignment5;

public class FindVowelCount {
  public  static boolean CheckVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' ||
                ch=='O' || ch=='U');
    }
    public static void Vowel(String str){
      int VowelCount = 0;
        for (int i = 0; i < str.length(); i++){
            if(CheckVowel(str.charAt(i))){
                VowelCount++;
            }
        }
        System.out.println("Number of Vowel(s) are: " +VowelCount);
    }
}
