package com.company.tenbitsAssignment5;

public class SwitchCaseExmple {

        public static void SwithcCase(int AnyNumber){
                    int remainder = AnyNumber % 10;

                    switch (remainder){
                        case 1:
                            System.out.println("Uni");
                            break;
                        case 2:
                            System.out.println("Twise");
                            break;
                        case 3:
                            System.out.println("Tri");
                            break;
                        case 4:
                            System.out.println("Quat");
                            break;
                        case 5:
                            System.out.println("Penta");
                            break;
                        case 6:
                            System.out.println("Hexa");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Octa");
                            break;
                        case 9:
                            System.out.println("Nano");
                            break;
                        default:
                            System.out.println("Deca");

                    }
        }
}
