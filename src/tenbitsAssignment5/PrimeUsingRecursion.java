package com.company.tenbitsAssignment5;

public class PrimeUsingRecursion {
    public static boolean CheckPrime(int[] array, int i) {
//new int[] {1, 4, 3, 6}
        for(int j = 0; j < array.length; j++){
            // Base cases
            if (array[i] <= 2)
                return array[i] == 2;
            if (array[i] % i == 0)
                return false;
            if (i * i > array[i])
                return true;

        }

            return CheckPrime(array, i + 1);
        }

    }

/* 1, 4, 5, 6, 13 */

/*
        public static boolean CheckPrime(int n, int i) {
//new int[] {1, 4, 3, 6}


                        // Base cases
                        if (n <= 2){
                                return n == 2;
                        }
                        if (n % i == 0){
                                return false;
                        }

                        if (i * i > n)
                        {       return true;
                        }


                return CheckPrime(n, i + 1);
        }

        public static void main(String[] args){

             if(CheckPrime(7, 2)){
                     System.out.println("Given Number is Prime");
             }
             else {
                     System.out.println("NOT Prime");
             }
        }*/