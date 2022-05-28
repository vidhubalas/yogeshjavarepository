package com.company;

public class CountSquares {
    public static void main(String[] args) {
        int N=100;
        System.out.println(countSquares(N));

    }
    static int countSquares(int N) {
        // code here
        int count=0;
        for(int i=1;i*i<N;i++)
            count++;
        return count;
    }
}
