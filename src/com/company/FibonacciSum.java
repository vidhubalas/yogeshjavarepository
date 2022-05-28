package com.company;

public class FibonacciSum{

    public static void main(String[] args) {
        int n=5,newTerm=0,first=-1, second=1, sum=0, temp=0;
        for(int i=0; i <=n; i++){
            newTerm = first + second;
            first = second;
            second = newTerm;
            sum = sum + newTerm;
            System.out.print(newTerm + " , ");
        }
        System.out.println(" Sum : " + sum);
    }
}


