package com.company.tenbitsAssignment5;

public class PrimeUsingRecursion {
    public  static  void  PrimeRec(int p, int d){

        int[] array = new int[] {1, 5, 4, 7};
        int PrimeCount = 0;
        int i = 0;
        for (i = 0; i < array.length; i++){
            if(array[i] <= 2){
                 PrimeCount = 0;
            }
            if (array[i] % d == 0){
              PrimeCount =  PrimeCount + 1;
            }

            if(d * d > array[i])
                PrimeCount =  PrimeCount + 1;
        }
        System.out.println(PrimeCount);
       PrimeRec(array[i], d + 1);

    }

}
/* 1, 4, 5, 6, 13 */