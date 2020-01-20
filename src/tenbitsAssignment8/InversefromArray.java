package com.company.tenbitsAssignment8;

import java.util.Arrays;

public class InversefromArray {
    public  static void revArray() {
        int codedMessage[] = new int[]{34, 38, 15, 21, 61, 43};

        int newCodedMessage[] = Arrays.copyOf(codedMessage, 6);


        for (int i = 0; i < codedMessage.length; ++i) {

            String value = String.valueOf(codedMessage[i]);
            String valueReversed = new StringBuilder(value).reverse().toString();
            codedMessage[i] = Integer.parseInt(valueReversed);

        }

        for (int i = 0; i < codedMessage.length; i++) {
            for (int j = 0; j < newCodedMessage.length; j++) {
                if (codedMessage[i] == newCodedMessage[j]) {
                    System.out.println(codedMessage[i] + "  and  " + newCodedMessage[i] + "  is the inverse pair");
                }
            }
        }

    }
}
