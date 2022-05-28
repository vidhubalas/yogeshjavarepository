package com.company;

public class PrimeNumber {
    public static void main(String[] args) {
        int N = 8,n=18;
        /*if(N==1)
            System.out.println(0);
        else
        System.out.println(prime(N));*/
        int arr[]=prime_pairs(n);
    }

    private static int prime(int N) {

        if(N<=1){
            return 0;
        }
        for(int i=2;i*i<=N;i++){
            if(N%i == 0){
                return 0;
            }
        }
        return 1;
    }

    public static int[] prime_pairs(int n)
    {
        // Code here
        int j=0;
        int arr[]= new int[10];
        /*if(n<=1){
            return 0;
        }*/
        for(int i=2;i<n;i++){
            if(n%i == 0){
                arr[j]=i;
                j++;
                System.out.print(i+",");
            }
        }
        return arr;
    }
    }

