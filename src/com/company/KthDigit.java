package com.company;

public class KthDigit {
    public static void main(String[] args) {
        int A=3,B=3,K=1,j=0;
        long result = 1;
        for(int i =1;i<=B;i++){
            result = A * result;
        }
        System.out.println(result);
        int rem=0;
        while(j<K){
            rem = (int) (result % 10); //2%10=2
            result = result / 10; //27/10=2
            j++;
        }
        //String r = Integer.toString(result);
        System.out.println(rem);
        //System.out.println(r.charAt(K));
    }
}
