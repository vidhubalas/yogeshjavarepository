package com.company;
 import java.lang.*;
public class staircase {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        int n = 100000000;
        while (sum <= n) {
            i++;
            sum = sum + i;
        }
        System.out.println(i-1);
    }
}
