package com.company.tenbitsAssignment3;

public class RemoveDuplicateFromArray {

    public static void ReducedArray() {

        int a[] = {1, 2, 3, 3, 6};
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
            a[j++] = a[a.length - 1];

        for (int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");
        }
    }

































}




