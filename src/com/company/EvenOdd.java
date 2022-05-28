package com.company;

import java.util.Scanner;

public class EvenOdd {

        public static void main(String args[]) {
            String n1 = "25148173731463915312587582359168542146128233293521647265369943585678177667884816967454879544889134", n2 = "322878533336973324172613272294525679521551827857332269476365";
            long N1, N2;
            System.out.println(n1.length());
            System.out.println(n1.charAt(n1.length()-1));
            N1 = n1.charAt(n1.length()-1);
            N2 = n2.charAt(n2.length()-1);
            //System.out.println("Enter an Integer number:");
            /*Scanner input = new Scanner(System.in);
            num = input.nextInt();*/
            if (N1 > 1 && N2 < Long.MAX_VALUE) {
                if ((N1*N2) % 2 == 0)
                    System.out.println("Entered number is even");
                else
                    System.out.println("Entered number is odd");
            }
        }
    }

