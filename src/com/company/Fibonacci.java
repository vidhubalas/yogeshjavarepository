package com.company;

public class Fibonacci {
    public static void main(String[] args) {
        long n1=1,n2=1,sum=0;
        int i=2,n=1;
        long arr[] = new long[n];
        if(n==1){
            arr[0]=n1;
            System.out.println(" 1 : " + n1);
        } else{
            arr[0] = n1;arr[1] = n2;
            System.out.print(arr[0] + " "+ arr[1]);
            for(i=2; i<n-2;i++){
                sum=n1+n2;
                arr[i] = sum;
                System.out.print(" " + sum);
                n1 = n2;
                n2 = sum;
            }
        }

        System.out.println();
        System.out.println("Count : " + i);
        }
    }

