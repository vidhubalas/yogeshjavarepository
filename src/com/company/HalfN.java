package com.company;

public class HalfN {
    public static void main(String[] args) {
        int N=100,M=4;
        for(int i=0;i<M-1;i++){
            N=N/2;
            System.out.print(N + ",");
        }
        System.out.println();
        System.out.println("Final Value : " + N);
    }
}
