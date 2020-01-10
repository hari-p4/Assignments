package com.company.tenbitsAssignmenet4;

public class ReverseArray {


    public static void Reverse()
    {
        int [] a = {1, 2, 3, 4, 5};
      int Arraylength =  a.length;
        int i, j, primary;
        for (i = 0; i < Arraylength / 2; i++) {
            primary = a[i];
            a[i] = a[Arraylength - i - 1];
            a[Arraylength - i - 1] = primary;
        }

        for (j = 0; j < Arraylength; j++) {
            System.out.println(a[j]);
        }
    }

}
