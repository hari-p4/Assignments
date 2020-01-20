package com.company.tenbitsAssignment8;

public class FindWordsWithVowels {

        public static void vowel(String paragraph) {

            String[] splitparagraph = paragraph.split(" ");

            for (String s : splitparagraph) {
                char c = s.charAt(0);
                if (c == 'a' || c == 'e' || c == 'i' ||
                        c == 'o' || c == 'u') {
                    System.out.println(s);
                }
            }
        }
}
