package com.company.tenbitsAssignment5;

public class FindTheAnswerofOperation {
    public  static void operation(){
            int a = 1;
            int b = 2;
            int c = 3;
            int d = 4;
            int f = 6;
            //1+2-3*4/6%2 Find the answer using java code.
        int result = a + b - c * d / f % b;
        System.out.println(result);
        System.out.println("modulo has the same level of precedence as * and / has");



    }
}
