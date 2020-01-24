package com.company.tenbitsAssignment9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class lamdaEx {
        public static void operationsOnLambda(){

                ArrayList<String> listofLang= new ArrayList<>( 8 );
                listofLang.add("c");
                listofLang.add("c++");
                listofLang.add("java");
                listofLang.add("dotnet");
                listofLang.add("go");
                listofLang.add("goa");
                listofLang.add("scalla");
                listofLang.add("python");

                Predicate<String> startsWithg = (n) -> n.startsWith("g");
                Predicate<String> endsWitha = (n) -> n.endsWith("a");
                Predicate<String> endsWithVA = (n) -> n.endsWith("va");
                Predicate<String> moreThanThree = (n) -> n.length() > 3;


                listofLang.stream().filter(endsWitha).forEach(f-> System.out.println(f));



        }


}
