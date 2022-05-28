package com.company;

public class SquareRoot {
    public static void main(String[] args) {
        int i = 1, N=576, result = 1;
        while (result <= N) {
            i++;
            result = i * i;
        }
        System.out.println(i -1);
    }
}
